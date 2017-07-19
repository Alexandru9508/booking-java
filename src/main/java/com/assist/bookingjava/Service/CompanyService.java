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
    public List<Company> getAllCompany() {
        List<Company> comapny = new ArrayList<>();
        companyDao.findAll().forEach(comapny :: add);
        return comapny;
    }
    //update:description,logo,companyName;

    public Company updateComapany(Company company){
        return companyDao.save(company);
    }
    
    public void deleteCompany(Long idcompany) {
        companyDao.delete(idcompany);
    }
    public Company recoverPassword(String email){
        return companyDao.findByEmail(email);
    }
    public String login (Company company) {
        System.out.println(company.getEmail()+"  "+company.getPassword());
        Company newCompany= companyDao.findByEmailAndPassword(company.getEmail(), company.getPassword());
        System.out.println(newCompany.getEmail()+"    "+newCompany.getPassword());
        if(company.getPassword().equals(newCompany.getPassword()) &&
                company.getEmail().equals(newCompany.getEmail()))
            return "Ok";
        else
            return "Login Failed!";
    }
    public Company log (Company company) {
        return  companyDao.findByEmailAndPassword(company.getEmail(), company.getPassword());
    }
    public Company getOneCompany(String name){
        return companyDao.findByCompanyname(name);
    }

}
