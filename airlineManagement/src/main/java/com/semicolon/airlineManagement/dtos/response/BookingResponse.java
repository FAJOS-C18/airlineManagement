package com.semicolon.airlineManagement.dtos.response;

import com.semicolon.airlineManagement.data.models.FlightType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BookingResponse {
    private String fro;
    private String to;
    private BigDecimal amount;
    private String seatNumber;
    private FlightType flightType;
    private String flightName;
    private LocalDateTime dateOfDeparture;
    private LocalDateTime returningDate;
}
