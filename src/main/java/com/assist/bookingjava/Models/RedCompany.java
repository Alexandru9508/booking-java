package com.assist.bookingjava.Models;

import javax.persistence.*;

/**
 * Created by doroftei on 13.07.2017.
 */
@Entity
@Table(name = "redcompany")
public class RedCompany {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idcompany;



    String username;
    String password;
    String email;
    String description;
    String companyname;
    String logo;

    public RedCompany(){}



    public RedCompany(String username, String password, String email, String description, String companyname, String logo) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.description = description;
        this.companyname = companyname;
        this.logo = logo;
    }

    public RedCompany(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    public void RedCompanyUpdate(String username, String password, String email, String description, String companyname, String logo,Long id) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.description = description;
        this.companyname = companyname;
        this.logo = logo;
        this.idcompany=id;
    }

    public long getIdcompany() {
        return idcompany;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getDescription() {
        return description;
    }

    public String getCompanyname() {
        return companyname;
    }

    public String getLogo() {
        return logo;
    }

    @Override
    public String toString() {

        return "RedCompany{" +
                "idcompany=" + idcompany +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", servicedescription='" + description + '\'' +
                ", companyname='" + companyname + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }



}
