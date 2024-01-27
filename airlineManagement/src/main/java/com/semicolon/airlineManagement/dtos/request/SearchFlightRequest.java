package com.semicolon.airlineManagement.dtos.request;

import lombok.Data;

@Data
public class SearchFlightRequest {
    private String sourceStation;
    private String destinationStation;
    private String flightType;
    private String date;
    private String time;
}
