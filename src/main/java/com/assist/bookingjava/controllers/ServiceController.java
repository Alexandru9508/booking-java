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

    @RequestMapping(value = "/Delete/Service/{id}",method = RequestMethod.GET)
    public  void delete(@PathVariable Long id){
        serviceService.Delete(id);
    }

    @RequestMapping(value = "/company/{id}/service", method = RequestMethod.POST)
    public String addServices(@RequestBody ServiceCompany companyService, @PathVariable Long id){
        companyService.setIdcompany (new Company(id,"","", "","", "", ""));
        serviceService.AddService(companyService);
        return "Saved!";
    }
    @RequestMapping(value = "/company/service/{id}",method = RequestMethod.GET)
    public ServiceCompany Serviceinfo(@PathVariable Long id ){
        return serviceService.findOne(id);
    }

    @RequestMapping(value = "/company/services",method = RequestMethod.GET)
    public List<ServiceCompany> allServices(){
        return  serviceService.getAllServices();
    }

}