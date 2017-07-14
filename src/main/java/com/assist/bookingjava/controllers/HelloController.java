package com.assist.bookingjava.controllers;
import com.assist.bookingjava.Models.Customer;
import com.assist.bookingjava.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping("/hello/add")
    public String addCustomer(){
        customerService.addCust(new Customer("alexd", "asdaad","sdass","sdsaasdd","dsaasds","aasdsd"));
        return "Done";

    }

}

