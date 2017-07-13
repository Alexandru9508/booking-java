package com.assist.bookingjava.DataBase;

import com.assist.bookingjava.Models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */
public interface CustomerDao extends CrudRepository<Customer,Long>{
    List<Customer>findById(Integer id);
}
