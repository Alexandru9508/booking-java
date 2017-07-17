package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.AddServiceDao;
import com.assist.bookingjava.Models.ServiceTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 14.07.2017.
 */
public class ServiceAddService {

    @Autowired
    private AddServiceDao addServiceDao;


    public ServiceTime getService(long id) {
        return addServiceDao.findOne(id);
    }
    public void addServiceDao(ServiceTime service){

        addServiceDao.save(service);
    }

    public List<ServiceTime> getService() {
        List<ServiceTime> services = new ArrayList<>();
        addServiceDao.findAll().forEach(services :: add);
        return services;
    }




}
