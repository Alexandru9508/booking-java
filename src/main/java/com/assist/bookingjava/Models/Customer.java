package com.assist.bookingjava.Models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by doroftei on 13.07.2017.
 */
@Entity
public class Customer {


    @Id
    long id;

    String firsname;
    String lastname;

    public Customer(long id, String firsname, String lastname) {
        this.id = id;
        this.firsname = firsname;
        this.lastname = lastname;
    }
    public  Customer(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
