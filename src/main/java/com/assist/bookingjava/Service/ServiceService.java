package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.ServiceDao;
import com.assist.bookingjava.Models.RedCompany;
import com.assist.bookingjava.Models.RedService;
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

    public List<RedService> getService() {
        List<RedService> serv = new ArrayList<>();
        serviceDao.findAll().forEach(serv :: add);
        return serv;
    }

    public void addService(RedService service){
        serviceDao.save(service);
    }







}
