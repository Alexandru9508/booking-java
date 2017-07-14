package com.assist.bookingjava.controllers;

import com.assist.bookingjava.Models.RedCompany;
import com.assist.bookingjava.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by prelipcean on 14.07.2017.
 */
@RestController
public class RedCompanyController {

    @Autowired
    CompanyService customerService;

    @GetMapping("/company")
    public List<RedCompany> getAllCompany() {
        return customerService.getAllCompany();
    }

    @RequestMapping(method=RequestMethod.POST, value="/company/addCustomer")
    public String addCustomer() {
        //customerService.addCompany(new RedCompany("alexd", "asdaad", "sdass", "sdf", "sdf", "sdffff"));

        customerService.addRegister(new RedCompany("alexd", "asdaad", "sdass"));

        return "Done";
    }


/*
    @RequestMapping(method = RequestMethod.PUT, value="/company/updateCustomer/{idcustomer}")
    public String updateCustomer(@RequestBody RedCompany company ,@PathVariable long  idcustomer) {
        //customerService.addCompany(new RedCompany("alexd", "asdaad", "sdass", "sdf", "sdf", "sdffff"));

        customerService.updateRegister(new RedCompany(), idcustomer);

        return "DoneUpdate";
    }
*/
}
