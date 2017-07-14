package com.assist.bookingjava.DataBase;

import com.assist.bookingjava.Models.RedServiceAdd;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by alex on 14.07.2017.
 */
public interface AddServiceDao extends CrudRepository<RedServiceAdd, Long> {

    List<RedServiceAdd>findById(Long id);

}
