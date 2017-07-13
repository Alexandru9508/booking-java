package com.assist.bookingjava.service;

import com.assist.bookingjava.model.alex;
import com.assist.bookingjava.repository.UserRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prelipcean on 13.07.2017.
 */

@Service
public class service
{

    private final UserRepo user;


    public service(UserRepo user) {
        this.user = user;
    }



    public List<alex> finalAll(){
        List<alex> alexs =new ArrayList<>();
        for(alex alex :user .findAll())
        {
            alexs.add(alex);
        }
        return alexs;
    }

    


}
