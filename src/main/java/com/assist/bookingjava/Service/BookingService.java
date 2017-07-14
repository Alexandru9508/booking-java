package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.BookingDao;
import com.assist.bookingjava.Models.RedBooking;
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

    public void addBooking(RedBooking booking){
        bookingDao.save(booking);
    }

    public List<RedBooking> getAllBooking() {
        List<RedBooking> booking = new ArrayList<>();
        bookingDao.findAll().forEach(booking :: add);
        return booking;
    }
}
