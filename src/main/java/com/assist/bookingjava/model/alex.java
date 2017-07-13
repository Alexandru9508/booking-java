package com.assist.bookingjava.model;

import javax.persistence.*;

/**
 * Created by prelipcean on 12.07.2017.
 */

@Entity
@Table(name = "alex")
public class alex {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id ;

    @Column( name ="username")
    protected String username;

    @Column( name = "password")
    protected String password;

    @Column(name = "email")
    protected String email;

    String eu;

    public alex(){

    }

    public alex(String id,String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        //Comment
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
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

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {

        return email;

    }

    @Override
    public String toString() {
        return "alex{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
