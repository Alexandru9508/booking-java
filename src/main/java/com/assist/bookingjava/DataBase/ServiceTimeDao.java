package com.assist.bookingjava.DataBase;

import com.assist.bookingjava.Models.ServiceCompany;
import com.assist.bookingjava.Models.ServiceTime;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  ServiceTimeDao extends CrudRepository<ServiceTime, Long> {
}
