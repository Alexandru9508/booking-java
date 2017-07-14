package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.RedCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyDao customerDao;


    public RedCompany getCompany(long id) {
        return customerDao.findOne(id);
    }
    public void addCompany(RedCompany company){
        customerDao.save(company);
    }

    public List<RedCompany> getAllCompany() {
        List<RedCompany> comapny = new ArrayList<>();
         customerDao.findAll().forEach(comapny :: add);
        return comapny;
    }

}
