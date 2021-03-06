package com.github.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
public class Alert {


    @Column(insertable = false, updatable = false)
    String vin;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int u_id;
    @Embedded
    @ManyToOne
    @JoinColumn(name = "id")
    private Reading reading;
    private String priority;


    public Reading getReading() {
        return reading;
    }

    public void setReading(Reading reading) {
        this.reading = reading;
        setU_id(reading.getId());


    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public long getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

}
