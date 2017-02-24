package com.ironyard.data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by rohanayub on 2/3/17.
 */
@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String hireDate;
    @OneToOne(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private Address homeAddress;
    @OneToOne(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private Address workAddress;
    @OneToMany(fetch = FetchType.EAGER,cascade = {CascadeType.ALL})
    private List<BootCamp> bootCampsTaught;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public List<BootCamp> getBootCampsTaught() {
        return bootCampsTaught;
    }

    public void setBootCampsTaught(List<BootCamp> bootCampsTaught) {
        this.bootCampsTaught = bootCampsTaught;
    }




}
