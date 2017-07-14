package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.AddServiceDao;
import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.RedCompany;
import com.assist.bookingjava.Models.RedServiceTime;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alex on 14.07.2017.
 */
public class RedServiceAddService {

    @Autowired
    private AddServiceDao addServiceDao;


    public RedServiceTime getService(long id) {
        return addServiceDao.findOne(id);
    }
    public void addServiceDao(RedServiceTime service){
        addServiceDao.save(service);
    }

    public List<RedServiceTime> getService() {
        List<RedServiceTime> services = new ArrayList<>();
        addServiceDao.findAll().forEach(services :: add);
        return services;
    }


}
