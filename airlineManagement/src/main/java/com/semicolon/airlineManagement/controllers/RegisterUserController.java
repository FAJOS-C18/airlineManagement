package com.semicolon.airlineManagement.controllers;

import com.semicolon.airlineManagement.dtos.request.UserRegisterRequest;
import com.semicolon.airlineManagement.services.UserService;
import com.semicolon.airlineManagement.utils.ApiResponse;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/airline_reservation/")
@AllArgsConstructor
public class RegisterUserController {

    private final UserService userService;
    @PostMapping("registerUser")
    public ResponseEntity<ApiResponse> registerUser(@RequestBody @Valid UserRegisterRequest registerUserRequest) {
        return new ResponseEntity<>(userService.register(registerUserRequest), HttpStatus.CREATED);

    }
}
