package com.assist.bookingjava.Models;

import javax.persistence.*;

/**
 * Created by doroftei on 14.07.2017.
 */
@Entity
@Table(name = "redbooking")
public class RedBooking {
     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     long idbooking;
     String customerName;
     String customerEmail;
     String customerPhone;
     String bookingDay;
     String bookingHour;
     @ManyToOne
    @JoinColumn(name = "idservice")
    private RedService service;

    public RedBooking(long idbooking, String customerName, String customerEmail, String customerPhone, String bookingDay, String bookingHour, RedService service) {
        this.idbooking = idbooking;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.bookingDay = bookingDay;
        this.bookingHour = bookingHour;
        this.service = service;
    }

    public long getIdbooking() {
        return idbooking;
    }

    public void setIdbooking(long idbooking) {
        this.idbooking = idbooking;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getBookingDay() {
        return bookingDay;
    }

    public void setBookingDay(String bookingDay) {
        this.bookingDay = bookingDay;
    }

    public String getBookingHour() {
        return bookingHour;
    }

    public void setBookingHour(String bookingHour) {
        this.bookingHour = bookingHour;
    }

    public RedService getService() {
        return service;
    }

    public void setService(RedService service) {
        this.service = service;
    }
}
