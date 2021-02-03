package com.brady.user.controller;

import com.brady.user.dto.SysUserDTO;
import com.brady.user.export.SysUserApi;
import com.fasterxml.jackson.databind.util.JSONPObject;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author brady.si
 */
@RestController
@Slf4j
public class SysUserController implements SysUserApi {

    /*@Override
    public boolean login(@Validated @RequestBody SysUserDTO.LoginDTO dto) {
        log.info("login---------------------");
        return true;
    }

    @Override
    public String userLogin(SysUserDTO.LoginDTO dto) {
        String s = dto.getUsername() + "------userLogin-------" + dto.getPassword();
        return s;
    }

    @Override
    public String adminLogin(@Validated @RequestBody SysUserDTO.LoginDTO dto) {
        String s = dto.getUsername() + "------adminLogin-------" + dto.getPassword();
        return s;
    }*/
}
