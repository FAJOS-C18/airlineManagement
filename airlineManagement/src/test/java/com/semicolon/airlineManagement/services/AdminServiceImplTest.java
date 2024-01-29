package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.repositories.AdminRepository;
import com.semicolon.airlineManagement.dtos.request.AddFlightRequest;
import lombok.AllArgsConstructor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@AllArgsConstructor
class AdminServiceImplTest {
    private AdminService adminService;
    private AdminRepository adminRepository;

    @AfterEach
    public void doThisAfterEachTest(){
        adminRepository.deleteAll();
    }

    @Test
    public void adminCanAddFlight(){
        AddFlightRequest addFlightRequest = new AddFlightRequest();
        addFlightRequest.setFlightNumber("BA123O1");
        addFlightRequest.setTypeFlight("Economic");
        addFlightRequest.setPrice(BigDecimal.valueOf(12000.00));
        addFlightRequest.setArrivalCity("Abuja");
        addFlightRequest.setDepartureCity("Lagos");
        addFlightRequest.setDepartureDate("09/3/2024");
        addFlightRequest.setArrivalTime("23:02:15");
        addFlightRequest.setDepartureTime("20:02:15");
        adminService.addFlight(addFlightRequest);
       // assertEquals(adminRepository.deleteAll())
    }


}