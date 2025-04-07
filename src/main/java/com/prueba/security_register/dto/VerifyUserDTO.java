package com.prueba.security_register.dto;

import lombok.Data;

@Data
public class VerifyUserDTO {
    private String email;
    private String verificationCode;
}
