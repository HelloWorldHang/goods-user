package com.brady.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author brady.si
 */
public class SysUserDTO {

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class LoginDTO{

        private String username;

        private String password;
    }

}
