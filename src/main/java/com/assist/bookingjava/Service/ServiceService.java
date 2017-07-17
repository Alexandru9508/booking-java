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
    final   List<ServiceCompany> serv = new ArrayList<>();


    public List<ServiceCompany> getService() {
        serviceDao.findAll().forEach(serv :: add);
        return serv;
    }

    public void addService(ServiceCompany service){
        serviceDao.save(service);
    }






}
