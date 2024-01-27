package com.semicolon.airlineManagement.data.models;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class BookFlight {
    @Id
    private Long id;
    private String fro;
    private String to;
    private String flightName;
    private BigDecimal amount;
    private String seatNumber;
    @Enumerated
    private FlightType flightType;
    private LocalDateTime dateOfDeparture;
    private LocalDateTime returningDate;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
}
