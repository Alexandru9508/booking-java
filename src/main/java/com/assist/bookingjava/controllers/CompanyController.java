package com.assist.bookingjava.controllers;

import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by doroftei on 14.07.2017.
 */
@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;


   //add:name,email,password
    @RequestMapping("/addCompany")
    @ResponseBody
    public String addNewCompany(String name, String email, String password) {
        try{
        companyService.addCompany(new Company(name,password,email));
        }catch (Exception ex) {
            return "User already exists!";
        }
        return "Data Saved!";
    }
    //update:description,logo,companyName;
    @RequestMapping("/updateCompany/{id}")
    public String updateCompany(@PathVariable Long id,String description,String companyname, String logo) {
        try {
            Company company;
            company = companyService.updateComapany(id);
            company.CompanyUpdate(company.getUsername(), company.getPassword(), company.getEmail(),
                    description, companyname, logo, company.getIdcompany());
            companyService.addCompany(company);
        }catch (Exception ex) {
            return "Error";
        }
        return"Succes";
    }
    //getPwdForEmail
    @RequestMapping("/delete/{idcompany}")
    @ResponseBody
    public String deleteCompany(@PathVariable Long idcompany) {
        if(idcompany!=null) {
            companyService.deleteCompany(idcompany);
            return "Deleted";
        }
            return "Error!";
    }

    @RequestMapping("/recover/{email}")
    @ResponseBody
    public String getByEmail(@PathVariable  String email) {
        Company companyUser;
        try {
          companyUser = companyService.recoverPassword(email);
        }catch (Exception er){
            return "Email not found";
        }
        return "The user pass is: "+ companyUser.getPassword();
    }

}