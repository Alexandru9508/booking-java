package com.assist.bookingjava.controllers;


import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.FileService;
import com.assist.bookingjava.Service.RecoverService;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @Autowired
    private FileService fileService;


    @RequestMapping(value="/register", method = RequestMethod.POST)
    public String addNewCompany(@RequestBody Company company) {
        try {
            // String salt = BCrypt.gensalt(12);
            // String hashed_password = BCrypt.hashpw(company.getPassword(), salt);
            companyService.addCompany(new Company(company.getUsername(), company.getPassword(), company.getEmail()));
        } catch (Exception ex) {
            return "User already exists!";
        }
        return "Data Saved!";
    }

    @RequestMapping(value = "/addCompanyInfo",method = RequestMethod.POST)
    public String addCompany(@RequestBody Company company){
        Company company1;

        try {

            company1 = companyService.findById(company);
            companyService.updateComapany(new Company(company1.getIdcompany(), company1.getUsername(), company1.getPassword(),
                    company1.getEmail(), company.getDescription(), company.getCompanyname(), company1.getLogo()));
        }catch (Exception e){
            return e.getMessage();
        }
        return "Done";
    }

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
        return companyService.getOneCompany(id);}


    @RequestMapping(value = "/info/{name}",method = RequestMethod.GET)
    public Company infoCompany(@PathVariable String name){
        return companyService.getOneCompany(name);

    }

    @RequestMapping(value = "/allCompanys",method = RequestMethod.GET)
    public List<Company> getAllCompany() {
        return companyService.getAllCompany();
    }

    @RequestMapping(value = "/uplodeImage",method = RequestMethod.POST)
    public String uploadFile(@RequestParam("file") MultipartFile multipartFile){
        return "SUCCES";
    }
}