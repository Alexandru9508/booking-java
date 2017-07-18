package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.ServiceDao;
import com.assist.bookingjava.Models.ServiceCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by prelipcean on 13.07.2017.
 */
@Service
public class ServiceService {

    @Autowired
    private ServiceDao serviceDao;

    public List<ServiceCompany> getAll(String name){
        List<ServiceCompany> services=new ArrayList<>();
        serviceDao.findByIdcompany_Companyname(name)
                .forEach(services::add);
        return services;
    }

    public void AddService(ServiceCompany serviceCompany){
        serviceDao.save(serviceCompany);
    }

}