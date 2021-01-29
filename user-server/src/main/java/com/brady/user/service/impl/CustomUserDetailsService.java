package com.brady.user.service.impl;

import com.brady.user.entity.*;
import com.brady.user.mapper.SysRoleMapper;
import com.brady.user.mapper.SysUserMapper;
import com.brady.user.mapper.SysUserRoleMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author brady.si
 */
public class CustomUserDetailsService implements UserDetailsService {

    @Resource
    SysUserMapper sysUserMapper;
    @Resource
    SysRoleMapper sysRoleMapper;
    @Resource
    SysUserRoleMapper sysUserRoleMapper;

    @Override
    public UserDetails loadUserByUsername(String nickname) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();

        // 根据用户名从数据库中取出用户信息
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andNicknameEqualTo(nickname);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        // 判断用户是否存在
        if (sysUsers == null || sysUsers.size() == 0){
            throw new RuntimeException("用户名不存在");
        }
        SysUser sysUser = sysUsers.get(0);

        // 查用户权限表添加权限
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(sysUser.getId());
        List<SysUserRole> sysUserRoles = sysUserRoleMapper.selectByExample(sysUserRoleExample);

        for (SysUserRole sysUserRole : sysUserRoles) {
            SysRoleExample sysRoleExample = new SysRoleExample();
            sysRoleExample.createCriteria().andIdEqualTo(sysUserRole.getRoleId());
            List<SysRole> sysRoles = sysRoleMapper.selectByExample(sysRoleExample);
            SysRole sysRole = sysRoles.get(0);
            authorities.add(new SimpleGrantedAuthority(sysRole.getName()));
        }

        // 返回UserDetails实现类
        return new User(sysUser.getUsername(), sysUser.getPassword(), authorities);
    }
}
