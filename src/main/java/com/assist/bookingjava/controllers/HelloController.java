package com.assist.bookingjava.controllers;

import com.assist.bookingjava.model.Customer;
import com.assist.bookingjava.model.alex;
import com.assist.bookingjava.repository.CustomerRepo;
import com.assist.bookingjava.repository.UserRepo;
import com.assist.bookingjava.service.CustService;
import com.assist.bookingjava.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by frunza on 07.07.2017.
 */
@RestController
public class HelloController {


    @RequestMapping("/hello")
    public String sayHi() {

        return "Hi Ionut Alex";
    }


}
