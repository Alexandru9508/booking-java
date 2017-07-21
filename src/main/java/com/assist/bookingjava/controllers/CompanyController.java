package com.assist.bookingjava.controllers;


import com.assist.bookingjava.Models.Company;
import com.assist.bookingjava.Service.CompanyService;
import com.assist.bookingjava.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.*;

/**
 * Created by doroftei on 14.07.2017.
 */
@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;



    @Autowired
    private FileService fileService;


    @RequestMapping(value = "/register", method = RequestMethod.POST)
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

    @RequestMapping(value = "/addCompanyInfo", method = RequestMethod.POST)
    public String addCompany(@RequestBody Company company) {
        Company company1;

        try {

            company1 = companyService.findById(company);
            companyService.updateComapany(new Company(company1.getIdcompany(), company1.getUsername(), company1.getPassword(),
                    company1.getEmail(), company.getDescription(), company.getCompanyname(), company1.getLogo()));
        } catch (Exception e) {
            return e.getMessage();
        }
        return "Done";
    }

    @RequestMapping(value = "/updateCompany/{id}", method = RequestMethod.PUT)
    public String updateCompany(@RequestBody Company company) {
        try {
            companyService.updateComapany(company);
        } catch (Exception ex) {
            return "Error";
        }
        return "Succes";
    }

    @RequestMapping(value = "/deleteCompany/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteCompany(@PathVariable Long idcompany) {
        try {
            companyService.deleteCompany(idcompany);
        } catch (Exception err) {
            return "Failed";
        }
        return "Company deleted!";
    }

    @RequestMapping(value = "/recover", method = RequestMethod.POST)
    @ResponseBody
    public String getByEmail(@RequestBody Company company) {
        Company companyUserEmail =   companyService.findByEmail(company.getEmail());

        final String username = "intershipassist@gmail.com";
        final String password = "bookingapplication";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("intershipassist@gmail.com"));


            String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            StringBuilder salt = new StringBuilder();
            Random rnd = new Random();
            while (salt.length() < 18) { // length of the random string.
                int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                salt.append(SALTCHARS.charAt(index));
            }
            String saltStr = salt.toString();

            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(companyUserEmail.getEmail()));
            message.setSubject("Sebicaaaa iti iau gatul!!!!");
            message.setText("Hello, your new password is: " + saltStr);



            companyService.updateComapany(new Company(companyUserEmail.getIdcompany(), companyUserEmail.getUsername(), saltStr,
                    companyUserEmail.getEmail(), companyUserEmail.getDescription(), companyUserEmail.getCompanyname(), companyUserEmail.getLogo()));

            Transport.send(message);


        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
        return "Mail sent!";

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