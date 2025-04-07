package com.prueba.security_register.dto;

import lombok.Data;

@Data
public class LoginUserDTO {
    private String email;
    private String password;
    private String username;
}
