package com.assist.bookingjava.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by prelipcean on 13.07.2017.
 */
@Entity
@Table(name = "redservice")
public class redservice {
    @Id
    long id_service;

    String name;
    String description;
    int space;
    int price;
    int duration;


    public redservice(){}

    public redservice(String name, String description, int space, int price, int duration) {
        this.name = name;
        this.description = description;
        this.space = space;
        this.price = price;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
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



    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "redservice{" +
                "id_service=" + id_service +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
