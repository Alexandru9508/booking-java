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
        companyService.addCompany(new Company(name,password,email));
        return "Done";
    }
    //update:description,logo,companyName;
    @RequestMapping("/updateCompany/{id}")
    public Company updateCompany(@PathVariable Long id,String description,String companyname, String logo) {
        Company company;
        company= companyService.updateComapany(id);
        company.CompanyUpdate(company.getUsername(),company.getPassword(),company.getEmail(),

                "NfdfdewDescription","CASA","urllll",company.getIdcompany());
        companyService.addCompany(company);
        return company;

    }
    //getPwdForEmail
    @RequestMapping("/getPassword/{id}")
    public String sendEmail(@PathVariable Long id){
        Company company;
        company=companyService.updateComapany(id);
        return company.getPassword();
    }


    @RequestMapping("/delete/{idcompany}")
    @ResponseBody
    public String deleteCompany(@PathVariable Long idcompany) {
        if(idcompany!=null) {
            companyService.deleteCompany(idcompany);
            return "Deleted";
        }
            return "Error!";
    }

    @RequestMapping("/get-by-email/{email}")
    @ResponseBody
    public String getByEmail(@PathVariable  String email) {
            Company companyUser = companyService.recoverPassword(email);
        return "The user pass is: " + companyUser.getPassword();
    }

}