package com.brady.user.export;

import com.brady.user.ServiceNameConst;
import com.brady.user.dto.SysUserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * @author brady.si
 */
@FeignClient(ServiceNameConst.SERVICE_NAME)
@Api("用户api")
public interface SysUserApi {
    /**
     * 用户登陆
     *
     * @param dto 接口入参
     * @return
     */
    /*@ApiOperation(value = "登陆", response = Boolean.class)
    @PostMapping(value = "/login", produces = APPLICATION_JSON_UTF8_VALUE, consumes = APPLICATION_JSON_UTF8_VALUE)
    boolean login(@Validated @RequestBody SysUserDTO.LoginDTO dto);

    *//**
     * 用户登陆
     *
     * @param dto 接口入参
     * @return
     *//*
    @ApiOperation(value = "登陆", response = Boolean.class)
    @PostMapping(value = "/user")
    @PreAuthorize("hasRole('ROLE_USER')")
    String userLogin(SysUserDTO.LoginDTO dto);

    *//**
     * 管理员登陆
     *
     * @param dto 接口入参
     * @return
     *//*
    @ApiOperation(value = "登陆", response = Boolean.class)
    @PostMapping(value = "/admin", produces = APPLICATION_JSON_UTF8_VALUE, consumes = APPLICATION_JSON_UTF8_VALUE)
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    String adminLogin(@Validated @RequestBody SysUserDTO.LoginDTO dto);*/

}
