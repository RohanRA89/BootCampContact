package com.ironyard.service;

import com.ironyard.data.Instructor;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
public class InstructorRepositoryTest {
    @Autowired
    InstructorRepository myInstructorRepo;

    public void saveToInstructorRepo(){
        Instructor teacher = new Instructor();
        teacher.setName("Rohan");
        teacher.setHireDate("March 15th 2015");
    }

}