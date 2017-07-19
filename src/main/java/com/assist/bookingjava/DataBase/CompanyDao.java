package com.assist.bookingjava.DataBase;




import com.assist.bookingjava.Models.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */


public interface CompanyDao extends CrudRepository<Company,Long>{

     Company findByEmail(String email);
     Company findByCompanyname(String name);
     Company findByIdcompany(Long id);
}
