package com.assist.bookingjava.DataBase;

import com.assist.bookingjava.Models.RedBooking;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by doroftei on 14.07.2017.
 */
public interface BookingDao extends CrudRepository<RedBooking,Long> {
    List<RedBooking> findByIdbooking(Long idbooking);
}
