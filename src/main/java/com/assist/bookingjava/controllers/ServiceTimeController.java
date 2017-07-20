package com.assist.bookingjava.controllers;

import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Models.ServiceCompany;
import com.assist.bookingjava.Models.ServiceTime;
import com.assist.bookingjava.Service.ServiceTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ServiceTimeController {

    @Autowired
    ServiceTimeService service;

    @RequestMapping(method = RequestMethod.POST,value = "/serviceCompany/{id}/addServiceInfo")
    public String setCompanyService(@RequestBody ServiceTime serviceTime , @PathVariable Long id){

        serviceTime.setServiceDetails(new ServiceCompany(id,"","",0,0,0));
        service.addServiceTime(serviceTime);

        return "Your service informations has been saved!";

    }

    @RequestMapping(method = RequestMethod.GET,value = "/serviceCompany/time")
    public List<ServiceTime> getAllCompany() {
        return service.getAllService();
    }

}
