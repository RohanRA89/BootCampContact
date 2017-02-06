package com.ironyard.data;

import javax.persistence.*;

/**
 * Created by rohanayub on 2/3/17.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToOne(cascade = CascadeType.ALL)
    private long id;
    private String street;
    private String city;
    private String state;
    private String country;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


}
