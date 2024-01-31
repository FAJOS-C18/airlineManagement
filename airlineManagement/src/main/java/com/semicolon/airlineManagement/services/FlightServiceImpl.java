package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.Flight;
import com.semicolon.airlineManagement.data.repositories.FlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FlightServiceImpl implements FlightService{
    private final FlightRepository flightRepository;
    @Override
    public List<Flight> findAll() {
        return flightRepository.findAll();
    }
}
