package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.CustomerDao;
import com.assist.bookingjava.Models.redcompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */
@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDao;


    public redcompany getCust(long id) {

        return customerDao.findOne(id);
    }
    public void addCust(redcompany customer){

        customerDao.save(customer);
    }

    public List<redcompany> getCust() {
        List<redcompany> courses = new ArrayList<>();
         customerDao.findAll().forEach(courses :: add);
        return courses;
    }

}
