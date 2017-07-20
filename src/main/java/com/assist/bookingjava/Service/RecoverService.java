package com.assist.bookingjava.Service;

import com.assist.bookingjava.Models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RecoverService {
    private JavaMailSender javaMailSender;
    @Autowired
    CompanyService companyService;

    @Autowired
    public RecoverService(JavaMailSender javaMailSender){

        this.javaMailSender = javaMailSender;

    }

    public void sendNotification(Company companyUser)throws MailException{

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(companyUser.getEmail());
        simpleMailMessage.setFrom("intershipassist@gmail.com");
        simpleMailMessage.setSubject("Your new password");
        companyUser.setPassword(GenerateRandomString().toString());
        simpleMailMessage.setText("Your new password is: " + GenerateRandomString().toString());
        companyService.updateComapany(new Company(companyUser.getIdcompany(), companyUser.getUsername(), companyUser.getPassword(),
                companyUser.getEmail(), companyUser.getDescription(), companyUser.getCompanyname(), companyUser.getLogo()));
        javaMailSender.send(simpleMailMessage);

    }


    public String GenerateRandomString(){

        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}
