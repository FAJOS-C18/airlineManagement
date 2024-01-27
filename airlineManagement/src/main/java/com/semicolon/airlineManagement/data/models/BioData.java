package com.semicolon.airlineManagement.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BioData {
    @Id
    private Long id;
    private String password;
    private String emailAddress;
    private boolean isLogin;
    private String phoneNumber;
}
