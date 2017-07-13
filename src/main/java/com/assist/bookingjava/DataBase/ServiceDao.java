package com.assist.bookingjava.DataBase;

import com.assist.bookingjava.Models.redservice;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by prelipcean on 13.07.2017.
 */
public interface ServiceDao extends CrudRepository<redservice,Long> {
      //  List<redservice> findById_service(Long id_service);
}
