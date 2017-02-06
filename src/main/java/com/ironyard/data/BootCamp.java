package com.ironyard.data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rohanayub on 2/3/17.
 */
@Entity
public class BootCamp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne
    private Instructor teacher;

    private String name;
    private String startDate;
    private String endDate;

    private Student students;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Instructor getTeacher() {
        return teacher;
    }

    public void setTeacher(Instructor teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }


}
