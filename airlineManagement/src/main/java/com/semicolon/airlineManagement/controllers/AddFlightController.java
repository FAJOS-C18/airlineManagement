package com.semicolon.airlineManagement.controllers;

import com.semicolon.airlineManagement.dtos.request.AddFlightRequest;
import com.semicolon.airlineManagement.services.AdminService;
import com.semicolon.airlineManagement.utils.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/airline_reservation/")
@AllArgsConstructor
public class AddFlightController {
    private final AdminService adminService;

    @PostMapping("addFlight")
    public ResponseEntity<ApiResponse> addFlight(@RequestBody AddFlightRequest addFlightRequest) {
        return new ResponseEntity<>(adminService.addFlight(addFlightRequest), HttpStatus.CREATED);

    }
}
