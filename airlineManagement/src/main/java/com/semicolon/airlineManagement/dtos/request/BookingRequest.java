package com.semicolon.airlineManagement.dtos.request;

import com.semicolon.airlineManagement.data.models.FlightType;
import com.semicolon.airlineManagement.data.models.User;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class BookingRequest {
    private String fro;
    private String to;
    private BigDecimal amount;
    private String seatNumber;
    private String flightName;
    private LocalDateTime returningDate;
    @Enumerated(EnumType.STRING)
    private FlightType flightType;
    @ManyToOne
    private User user;
}
