package com.semicolon.airlineManagement.data.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
   // private BioData bioData;
    private String phoneNumber;
    private String emailAddress;
    private String password;
    private  boolean isLogin;
    @Enumerated
    private Role role;




}
