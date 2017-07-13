package com.assist.bookingjava.repository;

import com.assist.bookingjava.model.alex;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by prelipcean on 12.07.2017.
 */

@org.springframework.stereotype.Repository
public interface UserRepo extends CrudRepository<alex,String >{

    List<alex> findByUsername(String username);

}
