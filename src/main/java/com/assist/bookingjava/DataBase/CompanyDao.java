package com.assist.bookingjava.DataBase;




import com.assist.bookingjava.Models.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */


public interface CompanyDao extends CrudRepository<Company,Long>{
    List<Company>findByIdcompany(Long id);
    public Company findByEmail(String email);
    public Company findByEmailAndPassword(String email, String password);
    public Company findByCompanyname(String name);
}
