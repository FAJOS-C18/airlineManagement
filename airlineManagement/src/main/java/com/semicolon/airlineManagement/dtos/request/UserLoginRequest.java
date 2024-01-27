package com.semicolon.airlineManagement.dtos.request;

import lombok.Data;

@Data
public class UserLoginRequest {
    private String password;
    private String username;
}
