package com.semicolon.airlineManagement.dtos.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class AddFlightRequest {
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
    private LocalDate departureDate;;
    private BigDecimal price;
   // @Enumerated(EnumType.STRING)
    private String flightType;
}
