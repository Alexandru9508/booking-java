package com.assist.bookingjava.Models;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

/**
 * Created by prelipcean on 13.07.2017.
 */
@Entity
@Table(name = "redservice")
public class RedService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idservice;

    @ManyToOne
    @JoinColumn(name = "idcompany")
    private RedCompany idcompany;


    String servicename;
    String servicedescription;
    int space;
    int price;
    int duration;


    public RedService(){}

    public RedService(String name, String description, int space, int price, int duration) {
        this.servicename = name;
        this.servicedescription = description;
        this.space = space;
        this.price = price;
        this.duration = duration;
    }

    public String getServicename() {
        return servicename;
    }

    public String getServicedescription() {
        return servicedescription;
    }

    public int getSpace() {
        return space;
    }

    public int getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public long getIdservice() {
        return idservice;
    }

    public RedCompany getIdcompany() {
        return idcompany;
    }

    public void setIdservice(long idservice) {
        this.idservice = idservice;
    }

    public void setIdcompany(RedCompany idcompany) {
        this.idcompany = idcompany;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public void setServicedescription(String servicedescription) {
        this.servicedescription = servicedescription;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "RedService{" +
                "idservice=" + idservice +
                ", servicename='" + servicename + '\'' +
                ", servicedescription='" + servicedescription + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
