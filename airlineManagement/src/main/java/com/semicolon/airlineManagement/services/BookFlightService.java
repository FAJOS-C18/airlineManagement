package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.dtos.request.BookingRequest;
import com.semicolon.airlineManagement.dtos.response.BookingResponse;

public interface BookFlightService {
    BookingResponse bookFlight(BookingRequest bookingRequest);
}
