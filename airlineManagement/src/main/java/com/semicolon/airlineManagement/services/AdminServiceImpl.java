package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.BookFlight;
import com.semicolon.airlineManagement.data.models.Flight;
import com.semicolon.airlineManagement.data.models.FlightType;
import com.semicolon.airlineManagement.data.models.User;
import com.semicolon.airlineManagement.data.repositories.FlightRepository;
import com.semicolon.airlineManagement.dtos.request.AddFlightRequest;
import com.semicolon.airlineManagement.dtos.request.AdminLoginRequest;
import com.semicolon.airlineManagement.dtos.request.AdminRegisterRequest;
import com.semicolon.airlineManagement.exceptions.FlightException;
import com.semicolon.airlineManagement.utils.ApiResponse;
import com.semicolon.airlineManagement.utils.GenerateApiResponse;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService{
    private ModelMapper modelMapper;
    private FlightRepository flightRepository;
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
        if (checkIfFlightExist(addFlightRequest.getFlightNumber())) {
            throw new FlightException(GenerateApiResponse.FLIGHT_ALREADY_EXIST);
        }
        Flight flight = modelMapper.map(addFlightRequest, Flight.class);
        flight.setFlightType(FlightType.valueOf(addFlightRequest.getFlightType().toUpperCase()));
        flightRepository.save(flight);
        return GenerateApiResponse.create(GenerateApiResponse.FLIGHT_ADDED_SUCCESSFULLY);
    }

    private boolean checkIfFlightExist(String flightNumber){
        Flight flight = flightRepository.findFlightByFlightNumber(flightNumber);
        return flight != null;
    }

    @Override
    public boolean AdminLogin(String emailAddress, String password) {
        return false;
    }
}
