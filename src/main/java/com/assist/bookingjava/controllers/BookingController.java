package com.assist.bookingjava.controllers;


import com.assist.bookingjava.Models.Booking;
import com.assist.bookingjava.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by doroftei on 14.07.2017.
 */
@RestController

public class BookingController {

    @Autowired
    BookingService bookingService;


}
