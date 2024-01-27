package com.semicolon.airlineManagement.dtos.request;

import lombok.Data;

@Data
public class UserLogoutRequest {
    private String email;
    private String password;
}
