package com.semicolon.airlineManagement.utils;

import org.springframework.http.HttpStatus;

public class GenerateApiResponse {
    public static final String USER_ALREADY_EXIST = "User already exist";
    public static final String USER_SUCCESSFULLY_REGISTERED = "User successfully registered";
    public static final String FLIGHT_ADDED_SUCCESSFULLY = "Flight added successfully";
    public static final String FLIGHT_ALREADY_EXIST = "Flight already exist";

    public static ApiResponse create(Object data) {
        return ApiResponse.builder()
                .data(data)
                .httpStatus(HttpStatus.CREATED)
                .statusCode(HttpStatus.CREATED.value())
                .isSuccessful(true)
                .build();
    }

}
