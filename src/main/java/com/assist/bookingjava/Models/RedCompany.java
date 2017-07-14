package com.assist.bookingjava.Models;

import javax.persistence.*;

/**
 * Created by doroftei on 13.07.2017.
 */
@Entity
    @Table(name = "RedCompany")
    public class RedCompany {


        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        long id;

        String username;
        String password;
        String email;
        String descriere;
        String nume_companie;
        String logo;



        public RedCompany() {
        }


        public RedCompany(String username, String password, String email, String descriere, String nume_companie, String logo) {
            this.username = username;
            this.password = password;
            this.email = email;
            this.descriere = descriere;
            this.nume_companie = nume_companie;
            this.logo = logo;
        }

        public long getId() {
            return id;
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

        public void setDescriere(String descriere) {
            this.descriere = descriere;
        }

        public void setNume_companie(String nume_companie) {
            this.nume_companie = nume_companie;
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

        public String getDescriere() {
            return descriere;
        }

        public String getNume_companie() {
            return nume_companie;
        }

        public String getLogo() {
            return logo;
        }

        @Override
        public String toString() {

            return "RedCompany{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", password='" + password + '\'' +
                    ", email='" + email + '\'' +
                    ", descriere='" + descriere + '\'' +
                    ", nume_companie='" + nume_companie + '\'' +
                    ", logo='" + logo + '\'' +
                    '}';
        }
    }
