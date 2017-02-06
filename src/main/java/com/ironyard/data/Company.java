package com.ironyard.data;

import javax.persistence.*;

/**
 * Created by rohanayub on 2/3/17.
 */
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String phone;

    private Address workAddress;

    private Instructor teacher;
    private BootCamp typesOfBootCamps;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public Instructor getTeacher() {
        return teacher;
    }

    public void setTeacher(Instructor teacher) {
        this.teacher = teacher;
    }

    public BootCamp getTypesOfBootCamps() {
        return typesOfBootCamps;
    }

    public void setTypesOfBootCamps(BootCamp typesOfBootCamps) {
        this.typesOfBootCamps = typesOfBootCamps;
    }



}