package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.BookFlight;
import com.semicolon.airlineManagement.data.models.User;
import com.semicolon.airlineManagement.dtos.request.AddFlightRequest;
import com.semicolon.airlineManagement.dtos.request.AdminLoginRequest;
import com.semicolon.airlineManagement.dtos.request.AdminRegisterRequest;
import com.semicolon.airlineManagement.utils.ApiResponse;

import java.util.List;

public class AdminServiceImpl implements AdminService{
    @Override
    public List<User> viewAllUsers(AdminLoginRequest adminLoginRequest) {
        return null;
    }

    @Override
    public List<BookFlight> viewAllBookedFlight(AdminLoginRequest adminLoginRequest) {
        return null;
    }

    @Override
    public ApiResponse register(AdminRegisterRequest adminRegisterRequest) {
        return null;
    }

    @Override
    public ApiResponse addFlight(AddFlightRequest addFlightRequest) {
        return null;
    }

    @Override
    public boolean AdminLogin(String emailAddress, String password) {
        return false;
    }
}
