package com.assist.bookingjava.controllers;

import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.RecoverService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

/**
 * Created by doroftei on 14.07.2017.
 */
@RestController
public class CompanyController {
    @Autowired
    CompanyService companyService;
    @Autowired
    RecoverService recoverService;
   //add:name,email,password
    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String addNewCompany(@RequestBody Company company) {

            try {

                String salt = BCrypt.gensalt(12);
                String hashed_password = BCrypt.hashpw(company.getPassword(), salt);
                companyService.addCompany(new Company(company.getUsername(), hashed_password, company.getEmail()));

            } catch (Exception ex) {

                return "User already exists!";

            }

            return "Data Saved!";
        }

    @RequestMapping(value = "/addCompanyInfo",method = RequestMethod.PUT)
    public String addCompany(@RequestBody Company company){
        Company company1;
        try {
            company1 = companyService.findById(company);
            companyService.updateComapany(new Company(company1.getIdcompany(), company1.getUsername(), company1.getPassword(),
                    company1.getEmail(), company.getDescription(), company.getCompanyname(), company.getLogo()));
        }catch (Exception e){
            return e.getMessage();
        }
         return "Done";
    }


    //update:description,logo,companyName;
    @RequestMapping(value="/updateCompany/{id}", method = RequestMethod.PUT)
    public String updateCompany(@RequestBody Company company) {
        try {
            companyService.updateComapany(company);
        }catch (Exception ex) {
            return "Error";
        }
        return"Succes";
    }

    @RequestMapping(value = "/deleteCompany/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteCompany(@PathVariable Long idcompany) {
        try {
            companyService.deleteCompany(idcompany);
        }catch (Exception err){
            return "Failed";
        }
            return "Company deleted!";
    }

    @RequestMapping(value = "/recover/{email}", method = RequestMethod.PUT)
    @ResponseBody
    public String getByEmail(@PathVariable  String email, @RequestBody Company company) {
        try {

            recoverService.sendNotification(company);

        }catch (MailException e){

            return "Mail error!" + e.getMessage();

        }


        return "Your password has been sent!";
    }
    @RequestMapping(value = "/info/{id}",method = RequestMethod.GET)
    public Company infoCompany(@PathVariable Long id){
        return companyService.getOneCompany(id);
    }

    @RequestMapping(value = "/allCompanys",method = RequestMethod.GET)
        public List<Company> getAllCompany() {
        return companyService.getAllCompany();
        }



}
