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
    public List<Company> getAllCompany() {
        return customerService.getAllCompany();
    }

    @RequestMapping("/hello/addUser")
    public String addCustomer() {
        customerService.addCompany(new Company("alexd", "asdaad", "sdass", "sdf", "sdf", "sdffff"));
        return "Done";
    }

/*
    @RequestMapping("/service")
    public List<ServiceCompany> getAllService() {

        return serviceService.getService();
    }

    @RequestMapping("/service/add")
    public String addService() {
        serviceService.addService(new ServiceCompany("alexd", "asdaad", 22, 55, 66));
        return "Done";
    }

<<<<<<< HEAD

    @RequestMapping("/service/delete")
    public String deleteService(@RequestParam long idservice) {
        serviceService.deleteService(idservice);
        return "Task deleted";
    }
*/



}








