package com.assist.bookingjava.controllers;


import com.assist.bookingjava.Models.ServiceCompany;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by prelipcean on 14.07.2017.
 */
@RestController
public class ServiceController {

    @Autowired
    ServiceService serviceService;

    @RequestMapping("/service")
    public List<ServiceCompany> getAllService() {
        return serviceService.getService();
    }

    @RequestMapping("/service/add")
    public String addService() {
        serviceService.addService(new ServiceCompany("ALEX", "AAAA", 20, 30, 40));
        return "Done";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/serviceDelete/{idservice}")
    public void deleteTopic(@PathVariable Long idservice) {
        serviceService.deleteService(idservice);
    }

}