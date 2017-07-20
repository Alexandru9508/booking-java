package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.BookingDao;
import com.assist.bookingjava.Models.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doroftei on 14.07.2017.
 */
@Service
public class BookingService {
    @Autowired
    BookingDao bookingDao;

    public List<Booking> AllBookings(){
        List<Booking>bookings=new ArrayList<>();
        bookingDao.findAll().
                forEach(bookings::add);
        return bookings;
    }

    public List<Booking> AllBookingsForService(Long id){
        List<Booking>bookings=new ArrayList<>();
        bookingDao.findByIdbooking(id).
        forEach(bookings::add);
        return bookings;
    }

    public void addBooking(Booking booking){
        bookingDao.save(booking);
    }
}
