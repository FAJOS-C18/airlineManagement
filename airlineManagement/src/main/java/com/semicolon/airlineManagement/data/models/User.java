package com.semicolon.airlineManagement.data.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
   // private BioData bioData;
    private String password;
    private String username;
    private String phoneNumber;
    private String email;
    @Enumerated
    private Role role;
    private String emailAddress;
    private boolean isLocked = true;
    private LocalDateTime localDateTime;
}
