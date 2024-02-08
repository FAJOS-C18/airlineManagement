package com.semicolon.airlineManagement.data.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long user_id;
    private String firstName;
    private String lastName;
    @OneToOne
    private BioData bioData;
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
