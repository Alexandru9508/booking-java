package com.assist.bookingjava.Models;

import javax.persistence.*;

/**
 * Created by alex on 14.07.2017.
 */
@Entity
@Table(name = "servicetime")
public class ServiceTime {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String dayStart;
    String dayStop;
    String hourStart;
    String hourStop;
    Long id_service;


    @ManyToOne
    @JoinColumn(name = "idservice")
    private ServiceCompany service;




    public ServiceTime(){}

    public ServiceTime(Long id, String dayStart, String dayStop, String hourStart, String hourStop, Long id_service) {
        this.id = id;
        this.dayStart = dayStart;
        this.dayStop = dayStop;
        this.hourStart = hourStart;
        this.hourStop = hourStop;
        this.id_service = id_service;
    }

    public Long getId() {
        return id;
    }

    public String getDayStart() {
        return dayStart;
    }

    public String getDayStop() {
        return dayStop;
    }

    public String getHourStart() {
        return hourStart;
    }

    public String getHourStop() {
        return hourStop;
    }

    public Long getId_service() {
        return id_service;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public void setDayStop(String dayStop) {
        this.dayStop = dayStop;
    }

    public void setHourStart(String hourStart) {
        this.hourStart = hourStart;
    }

    public void setHourStop(String hourStop) {
        this.hourStop = hourStop;
    }

    public void setId_service(Long id_service) {
        this.id_service = id_service;
    }

    @Override
    public String toString() {
        return "ServiceAdd{" +
                "id=" + id +
                ", dayStart='" + dayStart + '\'' +
                ", dayStop='" + dayStop + '\'' +
                ", hourStart='" + hourStart + '\'' +
                ", hourStop='" + hourStop + '\'' +
                ", id_service=" + id_service +
                ", Service=" + service +
                '}';
    }
}
