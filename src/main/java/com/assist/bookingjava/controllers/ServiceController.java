package com.assist.bookingjava.controllers;


import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Models.ServiceCompany;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.ServiceService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.Authenticator;
import java.util.List;

/**
 * Created by prelipcean on 14.07.2017.
 */
@RestController
public class ServiceController {

    @Autowired
    ServiceService serviceService;

    @RequestMapping(value = "/company/{name}/services", method = RequestMethod.GET)
    public List<ServiceCompany> getAll(@PathVariable String name){
        return serviceService.getAll(name);
    }

    @RequestMapping(value = "/company/{name}/service",method = RequestMethod.POST)
    public void addServices(@RequestParam  ServiceCompany companyService,@PathVariable String name){
        companyService.setIdcompany (new Company("","", "","", name, ""));
        serviceService.AddService(companyService);
    }

}