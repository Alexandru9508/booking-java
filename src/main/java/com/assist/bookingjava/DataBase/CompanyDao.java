package com.assist.bookingjava.DataBase;

import com.assist.bookingjava.Models.RedCompany;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */
public interface CompanyDao extends CrudRepository<RedCompany,Long>{
    List<RedCompany>findById(Long id);
}
