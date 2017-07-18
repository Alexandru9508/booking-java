package com.assist.bookingjava.controllers;

import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Service.CompanyService;
import org.mindrot.jbcrypt.BCrypt;
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
    @RequestMapping(value="/register", method = RequestMethod.POST)
    @ResponseBody
    public String addNewCompany(String name, String email, String password) {
        try{
            String salt = BCrypt.gensalt(12);
            String hashed_password = BCrypt.hashpw(password,salt);

        companyService.addCompany(new Company(name,hashed_password,email));
        }catch (Exception ex) {
            return "User already exists!";
        }
        return "Data Saved!";
    }
    //update:description,logo,companyName;
    @RequestMapping(value="/updateCompany/{id}", method = RequestMethod.PUT)
    public String updateCompany(@PathVariable Long id, String description, String companyname, String logo) {
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

    @RequestMapping(value = "/recover/{email}", method = RequestMethod.GET)
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
    @RequestMapping(value = "/info/{name}",method = RequestMethod.GET)
    public Company infoCompany(@PathVariable String name){
        return companyService.getOneCompany(name);
    }

    @RequestMapping(value = "/allCompanys",method = RequestMethod.GET)
        public List<Company> getAllCompany() {
        return companyService.getAllCompany();
        }
}
