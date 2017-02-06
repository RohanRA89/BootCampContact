package com.ironyard.service;

import com.ironyard.data.BootCamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
public class BootCampRepositoryTest {
    @Autowired
    BootCampRepository myBootCampRepo;

    public void saveToBootCampRepo(){
        BootCamp bootCampOne = new BootCamp();
        bootCampOne.setName("Java");
        bootCampOne.setStartDate("December 12th 2016");
        bootCampOne.setEndDate("February 16th 2017");
        bootCampOne.setTeacher();
        bootCampOne.setStudents();


    }

}