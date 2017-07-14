package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.RedCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */
@Service
public class CompanyService {
    @Autowired
    private CompanyDao companyDao;

    //add
    public void addCompany(RedCompany company)
    {
        companyDao.save(company);
    }
    //allCompany
    public List<RedCompany> getAllCompany() {
        List<RedCompany> comapny = new ArrayList<>();
        companyDao.findAll().forEach(comapny :: add);
        return comapny;
    }
    //update:description,logo,companyName;
    public RedCompany updateComapny(Long idcompany){
        return companyDao.findOne(idcompany);
    }

}