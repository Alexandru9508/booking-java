package com.assist.bookingjava.controllers;

import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Models.ServiceCompany;
import org.springframework.web.bind.annotation.RequestMapping;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;

import java.util.List;


@RestController
public class HelloController {


    @Autowired
    CompanyService customerService;

    @Autowired
    ServiceService serviceService;

    @RequestMapping("/hello")
    public List<Company> getAllCompany() {
        return customerService.getAllCompany();
    }

    @RequestMapping("/private")
    public String getAllsaCompany() {
        return "Private";
    }

    @RequestMapping("/hello/addUser")
    public String addCustomer() {
        customerService.addCompany(new Company("alexd", "asdaad", "sdass", "sdf", "sdf", "sdffff"));
        return "Done";
    }



}








