package com.assist.bookingjava.controllers;




import com.assist.bookingjava.Models.Company;
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
public class CompanyController {
    @Autowired
    CompanyService companyService;


    Company company=new Company("Ionut","test","doroftei@yonut");
    //add:name,email,psw
    @RequestMapping("/hello/addCompany")
    public String addNewCompany() {
        companyService.addCompany(company);
        return "Done";
    }
    //update:description,logo,companyName;
    @RequestMapping("/hello/updateCompany/{id}")
    public Company updateCompany(@PathVariable Long id) {
        Company company;
        company= companyService.updateComapany(id);
        company.CompanyUpdate(company.getUsername(),company.getPassword(),company.getEmail(),
                "NfdfdewDescription","CASA","urllll",company.getIdcompany());
        companyService.addCompany(company);
        return company;
    }
    //getPwdForEmail

    @RequestMapping("/hello/getPass/{id}")
    public String sendEmail(@PathVariable Long id){
        Company company;
        company=companyService.updateComapany(id);
        return company.getPassword();
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{idcompany}")
    public void deleteCompany(@PathVariable Long idcompany) {
        if(idcompany!=null) {
            companyService.deleteCompany(idcompany);
            System.out.println("Deleted");
        }

    }


}