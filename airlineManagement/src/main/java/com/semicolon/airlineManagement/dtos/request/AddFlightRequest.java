package com.semicolon.airlineManagement.dtos.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AddFlightRequest {
    private String flightNumber;
    private String departureCity;
    private String arrivalCity;
    private String departureTime;
    private String arrivalTime;
    private String departureDate;
    private BigDecimal price;
    private String typeFlight;
}
