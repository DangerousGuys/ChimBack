package com.example.chimhaha.dto;

import lombok.Data;

@Data
public class UserDto {
    private String email;
    private String pwd;
    private String nickName;
    private String userId;

    private String encryptedPwd;
}
