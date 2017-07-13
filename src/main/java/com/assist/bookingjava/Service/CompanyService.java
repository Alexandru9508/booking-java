package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.RedCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyDao customerDao;


    public RedCompany getCust(long id) {
        return customerDao.findOne(id);
    }
    public void addCust(RedCompany customer){
        customerDao.save(customer);
    }

    public List<RedCompany> getCust() {
        List<RedCompany> courses = new ArrayList<>();
         customerDao.findAll().forEach(courses :: add);
        return courses;
    }

}