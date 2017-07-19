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

    public Company updateComapany(Company company){
        return companyDao.save(company);
    }
    
    public void deleteCompany(Long idcompany) {
        companyDao.delete(idcompany);
    }
    public Company recoverPassword(String email){
        return companyDao.findByEmail(email);
    }

    public Company login (Company company) {
        return  companyDao.findByEmail(company.getEmail());
    }
    public Company findById(Company company){
        return companyDao.findByIdcompany(company.getIdcompany());
    }
    public Company getOneCompany(String name){
        return companyDao.findByCompanyname(name);
    }

}
