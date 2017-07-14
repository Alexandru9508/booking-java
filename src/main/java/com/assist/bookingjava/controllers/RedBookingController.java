package com.assist.bookingjava.controllers;

import com.assist.bookingjava.DataBase.BookingDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by doroftei on 14.07.2017.
 */
@RestController
public class RedBookingController {
    @Autowired
    BookingDao bookingDao;

    //addBooking
    //DeleteBooking
    //allBookings
}
