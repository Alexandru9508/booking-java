package com.assist.bookingjava.Models;

import javax.persistence.*;

/**
 * Created by prelipcean on 13.07.2017.
 */
@Entity
@Table(name = "RedService")
public class RedService {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long ids;

    String name;
    String description;
    int space;
    int price;
    int duration;


    public RedService(){}

    public RedService(String name, String description, int space, int price, int duration) {
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
        return "RedService{" +
                "ids=" + ids +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", space=" + space +
                ", price=" + price +
                ", duration=" + duration +
                '}';
    }
}
