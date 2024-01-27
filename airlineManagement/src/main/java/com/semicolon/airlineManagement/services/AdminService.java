package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.BookFlight;
import com.semicolon.airlineManagement.data.models.User;
import com.semicolon.airlineManagement.dtos.request.AddFlightRequest;
import com.semicolon.airlineManagement.dtos.request.AdminLoginRequest;
import com.semicolon.airlineManagement.dtos.request.AdminRegisterRequest;
import com.semicolon.airlineManagement.utils.ApiResponse;

import java.util.List;

public interface AdminService {
    List<User> viewAllUsers(AdminLoginRequest adminLoginRequest);

    List<BookFlight> viewAllBookedFlight(AdminLoginRequest adminLoginRequest);

    ApiResponse register(AdminRegisterRequest adminRegisterRequest);

    ApiResponse addFlight(AddFlightRequest addFlightRequest);

    boolean AdminLogin(String emailAddress , String password);
}
