package com.assist.bookingjava.controllers;
import com.assist.bookingjava.Models.Customer;
import com.assist.bookingjava.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by frunza on 07.07.2017.
 */
@RestController
public class HelloController {
    @Autowired
    CustomerService customerService;

    @RequestMapping("/hello")
    public List<Customer> getAllCourses() {
        return customerService.getCust();
    }

}

