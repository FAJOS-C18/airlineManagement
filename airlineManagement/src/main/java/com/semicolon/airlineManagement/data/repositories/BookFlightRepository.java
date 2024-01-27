package com.semicolon.airlineManagement.data.repositories;

import com.semicolon.airlineManagement.data.models.BookFlight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookFlightRepository extends JpaRepository<BookFlight, Long> {
    boolean existsByFlightName(String flightName);
}
