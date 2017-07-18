package com.assist.bookingjava.controllers;

import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by doroftei on 17.07.2017.
 */
@RestController
public class LoginController {
    @Autowired
    CompanyService companyService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public Company login(String email, String password){
        
        Company company =companyService.login(email,password);

        return company;

    }
}
