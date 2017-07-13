package com.assist.bookingjava.controllers;

import com.assist.bookingjava.model.alex;
import com.assist.bookingjava.repository.UserRepo;
import com.assist.bookingjava.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by frunza on 07.07.2017.
 */
@RestController
public class HelloController {

    @Autowired
    private service serv ;

    @RequestMapping("/hello")
    public String sayHi() {
	        //repo.save(new alex("ioi","iii","asdasd"));
return "Hi Ionut Alex";
    }

    @GetMapping ("/find")
    public String  allTask(){
         return serv.finalAll().toString();
    }



}
