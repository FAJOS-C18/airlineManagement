package com.semicolon.airlineManagement.dtos.request;

import com.semicolon.airlineManagement.data.models.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AdminRegisterRequest {
    @NotBlank(message = "This field must no be blank")
    private String firstName;
    @NotBlank(message = "This field must no be blank")
    private String lastName;
    @NotBlank(message = "This field must no be blank")
    private String password;
    @NotBlank(message = "This field must no be blank")
    private String phoneNumber;
    @NotBlank(message = "This field must no be blank")
    private String email;
    @NotBlank(message = "This field must no be blank")
    private Role role;
}
