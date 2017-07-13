package com.assist.bookingjava.controllers;

import com.assist.bookingjava.Models.redcompany;
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
    public List<redcompany> getAllCourses() {
        return customerService.getCust();
    }
    @RequestMapping("/hello/add")
    public String addCustomer(){
        customerService.addCust(new redcompany("alexsd", "asdaafd","sdasas","sdsasdaasdd","dsaaffsds","aassadsd"));
        return "Done";
    }

}

