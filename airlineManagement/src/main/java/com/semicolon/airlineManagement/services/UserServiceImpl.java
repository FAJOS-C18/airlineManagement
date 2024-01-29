package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.User;
import com.semicolon.airlineManagement.data.repositories.UserRepository;
import com.semicolon.airlineManagement.dtos.request.SearchFlightRequest;
import com.semicolon.airlineManagement.dtos.request.UserLoginRequest;
import com.semicolon.airlineManagement.dtos.request.UserLogoutRequest;
import com.semicolon.airlineManagement.dtos.request.UserRegisterRequest;
import com.semicolon.airlineManagement.exceptions.UserException;
import com.semicolon.airlineManagement.utils.ApiResponse;
import com.semicolon.airlineManagement.utils.GenerateApiResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    private final ModelMapper modelMapper;
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
        if (checkIfUserExist(userRegisterRequest.getEmailAddress())) {
            throw new UserException(GenerateApiResponse.USER_ALREADY_EXIST);
        }
        User user = modelMapper.map(userRegisterRequest, User.class);
        userRepository.save(user);
        return GenerateApiResponse.create(GenerateApiResponse.USER_SUCCESSFULLY_REGISTERED);
    }

    @Override
    public ApiResponse searchFlight(SearchFlightRequest searchFlightRequest) {
        return null;
    }

    private boolean checkIfUserExist(String emailAddress) {
        User user = userRepository.findByEmailAddress(emailAddress);
        return user != null;
    }
}
