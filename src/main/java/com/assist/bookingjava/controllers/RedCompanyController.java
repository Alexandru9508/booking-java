package com.assist.bookingjava.controllers;



import com.assist.bookingjava.DataBase.CompanyDao;

import com.assist.bookingjava.Models.RedCompany;
import com.assist.bookingjava.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by prelipcean on 14.07.2017.
 */


/**
 * Created by doroftei on 14.07.2017.
 */
@RestController
public class RedCompanyController {
    @Autowired
    CompanyService companyService;

    RedCompany company=new RedCompany("ioon","test","doroftei@yonut");
    //add:name,email,psw
    @RequestMapping("/hello/addCompany")
    public String addNewCompany() {
        companyService.addCompany(company);
        return "Done";
    }
    //update:description,logo,companyName;
    @RequestMapping("/hello/updateCompany/{id}")
    public RedCompany updateCompany(@PathVariable Long id) {
        RedCompany company;
        company= companyService.updateComapny(id);
        company.RedCompanyUpdate(company.getUsername(),company.getPassword(),company.getEmail(),
                "NfdfdewDescription","CASA","urllll",company.getIdcompany());
       companyService.addCompany(company);
       return company;
    }
    //getPwdForEmail

    @RequestMapping("/hello/getPass/{id}")
    public String sendEmail(@PathVariable Long id){
        RedCompany company;
        company=companyService.updateComapny(id);
        return company.getPassword();
    }



}
