package com.assist.bookingjava.controllers;

import com.assist.bookingjava.Models.RedService;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.ServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by prelipcean on 14.07.2017.
 */
@RestController
public class RedServiceController {

    @Autowired
    ServiceService serviceService;
/*
    @RequestMapping("/service")
    public List<RedService> getAllService() {
        return serviceService.getService();
    }

    @RequestMapping("/service/add")
    public String addService() {
        serviceService.addService(new RedService("alexd", "asdaad", 22, 55, 66));
        return "Done";
    }

    @RequestMapping("/service/delete")
    public String deleteService(@RequestParam long idservice) {
        serviceService.deleteService(idservice);
        return "Task deleted";
    }*/
}
