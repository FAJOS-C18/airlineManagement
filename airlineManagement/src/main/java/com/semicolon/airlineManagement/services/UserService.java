package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.Flight;
import com.semicolon.airlineManagement.dtos.request.SearchFlightRequest;
import com.semicolon.airlineManagement.dtos.request.UserLoginRequest;
import com.semicolon.airlineManagement.dtos.request.UserLogoutRequest;
import com.semicolon.airlineManagement.dtos.request.UserRegisterRequest;
import com.semicolon.airlineManagement.utils.ApiResponse;

import java.util.List;

public interface UserService {
    ApiResponse logoutUser(UserLogoutRequest userLogoutRequest);

    void login(UserLoginRequest userLoginRequest);
    void cancelTicket();

    ApiResponse register(UserRegisterRequest userRegisterRequest);

    List<Flight> viewAllFlight(SearchFlightRequest searchFlightRequest);
}
