package com.assist.bookingjava.Models;

import javax.persistence.*;

/**
 * Created by alex on 14.07.2017.
 */
@Entity
@Table(name = "service_time")
public class ServiceTime {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String dayStart;
    String dayStop;
    String hourStart;
    String hourStop;


    @ManyToOne
    private ServiceCompany idservice;


    public void setIdservice(ServiceCompany idservice) {
        this.idservice = idservice;
    }

    public ServiceTime(){}

    public ServiceTime(Long id, String dayStart, String dayStop, String hourStart, String hourStop, Long idservice) {
        this.id = id;
        this.dayStart = dayStart;
        this.dayStop = dayStop;
        this.hourStart = hourStart;
        this.hourStop = hourStop;
        this.idservice=new ServiceCompany(id,"","",0,0,0);
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

    public ServiceCompany getIdservice() {
        return idservice;
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



    public void setServiceDetails(ServiceCompany idservice) {
        this.idservice = idservice;
    }


}
