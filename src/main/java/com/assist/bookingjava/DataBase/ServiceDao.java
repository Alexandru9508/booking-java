package com.assist.bookingjava.DataBase;

import com.assist.bookingjava.Models.ServiceCompany;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by prelipcean on 13.07.2017.
 */
public interface ServiceDao extends CrudRepository<ServiceCompany,Long> {
      List<ServiceCompany> findByIdservice(Long idservice);

}
