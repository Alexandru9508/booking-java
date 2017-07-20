package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.ServiceTimeDao;
import com.assist.bookingjava.Models.ServiceTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 14.07.2017.
 */
@Service
public class ServiceTimeService {

    @Autowired
    ServiceTimeDao serviceTimeDao;


    public ServiceTime getService(long id) {
        return serviceTimeDao.findOne(id);
    }

    public void addServiceDao(ServiceTime service) {

        serviceTimeDao.save(service);
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
