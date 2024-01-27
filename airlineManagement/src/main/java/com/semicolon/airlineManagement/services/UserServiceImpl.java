package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.dtos.request.SearchFlightRequest;
import com.semicolon.airlineManagement.dtos.request.UserLoginRequest;
import com.semicolon.airlineManagement.dtos.request.UserLogoutRequest;
import com.semicolon.airlineManagement.dtos.request.UserRegisterRequest;
import com.semicolon.airlineManagement.utils.ApiResponse;

public class UserServiceImpl implements UserService{
    @Override
    public ApiResponse logoutUser(UserLogoutRequest userLogoutRequest) {
        return null;
    }

    @Override
    public void login(UserLoginRequest userLoginRequest) {

    }

    @Override
    public void cancelTicket() {

    }

    @Override
    public ApiResponse register(UserRegisterRequest userRegisterRequest) {
        return null;
    }

    @Override
    public ApiResponse searchFlight(SearchFlightRequest searchFlightRequest) {
        return null;
    }
}
