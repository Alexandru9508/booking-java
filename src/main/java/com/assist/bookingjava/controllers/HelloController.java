package com.assist.bookingjava.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import com.assist.bookingjava.Models.RedCompany;
import com.assist.bookingjava.Models.RedService;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by frunza on 07.07.2017.
 */
@RestController
public class HelloController {

    @Autowired
    CompanyService customerService;

    @Autowired
    ServiceService serviceService;

    @RequestMapping("/hello")
    public List<RedCompany> getAllCourses() {
        return customerService.getCust();
    }

    @RequestMapping("/hello/add")
    public String addCustomer(){
        customerService.addCust(new RedCompany("alexd", "asdaad","sdass","sdsaasdd","dsaasds","aasdsd"));
        return "Done";
    }

    @RequestMapping("/service")
    public List<RedService> getAllService() {
        return serviceService.getService();
    }
    @RequestMapping("/Service/add")
    public String addService(){
        serviceService.addService(new RedService("alexd", "asdaad",22,55,66));
        return "Done";
    }

}

