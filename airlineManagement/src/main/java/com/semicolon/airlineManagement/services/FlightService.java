package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> findAll();
}
