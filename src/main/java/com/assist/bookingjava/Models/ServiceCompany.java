package com.assist.bookingjava.Models;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Required;

import javax.persistence.*;

/**
 * Created by prelipcean on 13.07.2017.
 */
@Entity
@Table(name = "companyService")
public class ServiceCompany {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idservice;

    @ManyToOne
    @JoinColumn(name="idcompany")
    private Company idcompany;

    @NotEmpty

    String servicename;
    @NotEmpty
    String servicedescription;
    @NotEmpty
    int space;
    @NotEmpty
    int price;
    @NotEmpty
    int duration;

    public ServiceCompany(){}

    public ServiceCompany(String name, String description, int space, int price, int duration,Long Companyid) {
        this.servicename = name;
        this.servicedescription = description;
        this.space = space;
        this.price = price;
        this.duration = duration;
        this.idcompany=new Company(Companyid,"","", "","", "", "");
    }

    public ServiceCompany(long id,String servicename,String servicedescription, int space, int price, int duration){
        this.idservice=id;
        this.servicename=servicename;
        this.servicedescription=servicedescription;
        this.price=price;
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

    public Company getIdcompany() {
        return idcompany;
    }

    public void setIdservice(long idservice) {
        this.idservice = idservice;
    }

    public void setIdcompany(Company idcompany) {
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
        return "ServiceCompany{" +
                "idservice=" + idservice +
                ", servicename='" + servicename + '\'' +
                ", servicedescription='" + servicedescription + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
