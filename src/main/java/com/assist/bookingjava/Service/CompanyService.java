package com.assist.bookingjava.Service;

import com.assist.bookingjava.DataBase.CompanyDao;
import com.assist.bookingjava.Models.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.RequestParam;

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
    public void addCompany(Company company)
    {
        companyDao.save(company);
    }



     


    //allCompany
<<<<<<< HEAD

    public List<RedCompany> getAllCompany() {
        List<RedCompany> comapny = new ArrayList<>();
=======
    public List<Company> getAllCompany() {
        List<Company> comapny = new ArrayList<>();
>>>>>>> stroia
        companyDao.findAll().forEach(comapny :: add);
        return comapny;
    }
    //update:description,logo,companyName;
<<<<<<< HEAD

    public RedCompany updateComapny(Long idcompany){
=======
    public Company updateComapny(Long idcompany){
>>>>>>> stroia
        return companyDao.findOne(idcompany);
    }

    public void deleteCompany(Long idcompany) {
        companyDao.delete(idcompany);
    }

}