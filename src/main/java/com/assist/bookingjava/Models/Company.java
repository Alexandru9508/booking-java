package com.assist.bookingjava.Models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.List;

/**
 * Created by doroftei on 13.07.2017.
 */
@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long idcompany;

    @Column(unique = true)
    @NotEmpty
    String username;
    @NotEmpty
    String password;

    @Column(unique = true)
    @NotEmpty
    String email;
    String description;

    @Column(unique = true)
    String companyname;
    String logo;

    public Company(){
    }

    public Company(String email,String password){
        this.email=email;
        this.password=password;
    }

    public Company(String username, String password, String email, String description, String companyname, String logo) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.description = description;
        this.companyname = companyname;
        this.logo = logo;
    }

    public Company(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Company(Long idcompany,String username, String password, String email, String description, String companyname, String logo){
        this.idcompany=idcompany;
        this.username = username;
        this.password = password;
        this.email = email;
        this.description = description;
        this.companyname = companyname;
        this.logo = logo;
    }

    public void setIdcompany(long idcompany) {
        this.idcompany = idcompany;
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