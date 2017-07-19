package com.assist.bookingjava.controllers;

import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Models.ServiceCompany;
import com.assist.bookingjava.Models.ServiceTime;
import com.assist.bookingjava.Service.ServiceTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class ServiceTimeController {
    @Autowired
    ServiceTimeService serviceTimeService;

    @RequestMapping(method = RequestMethod.POST,value = "/serviceCompany/{id}/addServiceInfo")
    public String setCompanyService(@RequestBody ServiceTime serviceTime , @PathVariable Long id){

        serviceTime.setServiceDetails(new ServiceCompany(id,"","",0,0,0));
        serviceTimeService.addServiceTime(serviceTime);

        return "Your service informations has been saved!";

    }

    @RequestMapping(method = RequestMethod.GET,value = "/serviceCompany/time")
    public List<ServiceTime> getAllCompany() {
        return serviceTimeService.getAllService();
    }

}
