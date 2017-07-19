package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.AddServiceDao;
import com.assist.bookingjava.DataBase.ServiceTimeDao;
import com.assist.bookingjava.Models.ServiceCompany;
import com.assist.bookingjava.Models.ServiceTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 14.07.2017.
 */
public class ServiceTimeService {

    @Autowired
    private AddServiceDao addServiceDao;

    @Autowired
    ServiceTimeDao serviceTimeDao;


    public ServiceTime getService(long id) {
        return addServiceDao.findOne(id);
    }

    public void addServiceDao(ServiceTime service) {

        addServiceDao.save(service);
    }

    public List<ServiceTime> getAllService() {
        List<ServiceTime> services = new ArrayList<>();
        serviceTimeDao.findAll().forEach(services::add);
        return services;
    }

    public void addServiceTime(ServiceTime serviceTime) {
        serviceTimeDao.save(serviceTime);


    }



}
