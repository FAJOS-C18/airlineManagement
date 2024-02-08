package com.semicolon.airlineManagement.data.repositories;

import com.semicolon.airlineManagement.data.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    Flight findFlightByFlightNumber(String flightNumber);

}
