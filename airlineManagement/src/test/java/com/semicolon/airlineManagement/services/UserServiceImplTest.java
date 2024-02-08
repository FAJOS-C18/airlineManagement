package com.semicolon.airlineManagement.services;

import com.semicolon.airlineManagement.data.repositories.UserRepository;
import com.semicolon.airlineManagement.dtos.request.SearchFlightRequest;
import com.semicolon.airlineManagement.dtos.request.UserRegisterRequest;
import com.semicolon.airlineManagement.exceptions.UserException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.modelmapper.internal.bytebuddy.matcher.ElementMatchers.is;

@SpringBootTest
class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    @AfterEach
    public void doThisAfterEachTest(){
        userRepository.deleteAll();
    }

    @Test
    public void registerUser_countIsOneTest()  {
        UserRegisterRequest userRegisterRequest = new UserRegisterRequest();
        assertEquals(0, userRepository.count());
        userRegisterRequest.setEmailAddress("udeme5017@gmail.com");
        userRegisterRequest.setFirstName("Joy");
        userRegisterRequest.setPassword("1234");
        userRegisterRequest.setLastName("joseph");
        userRegisterRequest.setPhoneNumber("090182934");
        userService.register(userRegisterRequest);
        assertEquals(1, userRepository.count());
    }

    @Test
    public void registerUser_registerSameSellerAgain_throwExceptionTest(){
        UserRegisterRequest request = new UserRegisterRequest();
        request.setPhoneNumber("09018296447");
        request.setEmailAddress("joy828545@Gmail.com");
        request.setFirstName("Joy");
        request.setLastName("Joseph");
        request.setPassword("password");
        userService.register(request);
        assertThrows(UserException.class, ()-> userService.register(request));
    }

    @Test
    public void registerTwoUsers_countIsTwoTest(){
        UserRegisterRequest request = new UserRegisterRequest();
        assertEquals(1, userRepository.count());
        request.setPhoneNumber("09018296447");
        request.setEmailAddress("joy828545@Gmail.com");
        request.setFirstName("Joy");
        request.setLastName("Joseph");
        request.setPassword("password");
        userService.register(request);

        UserRegisterRequest request2 = new UserRegisterRequest();
        request2.setPassword("pass");
        request2.setFirstName("Jude");
        request2.setLastName("Joseph");
        request2.setPhoneNumber("0901284453");
        request2.setEmailAddress("jude1234@Gmail.com");
        userService.register(request2);
        assertEquals(3, userRepository.count());
    }

    @Test
    public void testThatUserCanViewAllFlights(){
        SearchFlightRequest flightRequest = new SearchFlightRequest();
        flightRequest.setEmailAddress("joy828545@gmail.com");
        assertEquals(2, userService.viewAllFlight(flightRequest).size());
    }

}