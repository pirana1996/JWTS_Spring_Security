package com.auth0.samples.authapi.springbootauthupdated.automobile.model;

import javax.persistence.*;
import java.time.ZonedDateTime;

@Entity
@Table(name = "car_listings")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;
    private String fuel;
    private long milages;
    private String location;
    private ZonedDateTime date;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public long getMilages() {
        return milages;
    }

    public void setMilages(long milages) {
        this.milages = milages;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ZonedDateTime getDate() {
        return date;
    }

    public void setDate(ZonedDateTime date) {
        this.date = date;
    }
}
