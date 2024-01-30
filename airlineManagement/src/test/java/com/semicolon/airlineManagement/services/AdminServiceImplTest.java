package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.models.FlightType;
import com.semicolon.airlineManagement.data.repositories.AdminRepository;
import com.semicolon.airlineManagement.dtos.request.AddFlightRequest;
import com.semicolon.airlineManagement.exceptions.FlightException;
import com.semicolon.airlineManagement.utils.GenerateApiResponse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class AdminServiceImplTest {
    @Autowired
    private AdminService adminService;
    @Autowired
    private AdminRepository adminRepository;

    @AfterEach
    public void doThisAfterEachTest(){
        adminRepository.deleteAll();
    }

    @Test
    public void adminCanAddFlight(){
        AddFlightRequest addFlightRequest = new AddFlightRequest();
        addFlightRequest.setFlightNumber("BA123O1");
        addFlightRequest.setFlightType("Business");
        addFlightRequest.setPrice(BigDecimal.valueOf(12000.00));
        addFlightRequest.setArrivalCity("Abuja");
        addFlightRequest.setDepartureCity("Lagos");
        addFlightRequest.setDepartureDate(LocalDate.parse("2024-01-29"));
        addFlightRequest.setArrivalTime(LocalTime.parse("23:02:15"));
        addFlightRequest.setDepartureTime(LocalTime.parse("20:02:15"));
        assertEquals(GenerateApiResponse.create(GenerateApiResponse.FLIGHT_ADDED_SUCCESSFULLY).getHttpStatus(),adminService.addFlight(addFlightRequest).getHttpStatus());
    }

    @Test
    public void adminCanAddFlight_sameFlightCannotBeAddedTwice_throwException(){
        AddFlightRequest addFlightRequest = new AddFlightRequest();
        addFlightRequest.setFlightNumber("DA126O2");
        addFlightRequest.setFlightType("FirstClass");
        addFlightRequest.setPrice(BigDecimal.valueOf(100000.00));
        addFlightRequest.setArrivalCity("Kano");
        addFlightRequest.setDepartureCity("Lagos");
        addFlightRequest.setDepartureDate(LocalDate.parse("2024-02-09"));
        addFlightRequest.setArrivalTime(LocalTime.parse("09:06:10"));
        addFlightRequest.setDepartureTime(LocalTime.parse("07:10:30"));
        adminService.addFlight(addFlightRequest);
        assertThrows(FlightException.class, ()-> adminService.addFlight(addFlightRequest));
       // assertEquals(GenerateApiResponse.create(GenerateApiResponse.FLIGHT_ADDED_SUCCESSFULLY).getHttpStatus(),adminService.addFlight(addFlightRequest).getHttpStatus());
    }


}