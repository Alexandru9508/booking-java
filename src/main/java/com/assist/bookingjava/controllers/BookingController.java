package com.assist.bookingjava.controllers;


import com.assist.bookingjava.Models.Booking;
import com.assist.bookingjava.Models.ServiceCompany;
import com.assist.bookingjava.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by doroftei on 14.07.2017.
 */
@RestController

public class BookingController {

    @Autowired
    BookingService bookingService;

    @RequestMapping(method = RequestMethod.GET,value = "/services/bookings")
    public List<Booking> AllBookings(){
        return bookingService.AllBookings();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/service/{name}/bookings")
    public List<Booking> AllServiceBookings(@PathVariable  String name){
        return bookingService.AllBookingsForService(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/service/{id}/addbooking")
    public String addBooking(@RequestBody Booking booking, @PathVariable Long id){
        booking.setService(new ServiceCompany(id,"","",0,0,0));
        bookingService.addBooking(booking);
        return "Saved";
    }
}
