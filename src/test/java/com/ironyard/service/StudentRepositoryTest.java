package com.ironyard.service;

import com.ironyard.data.Student;
import com.ironyard.data.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class StudentRepositoryTest {
    @Autowired
    StudentRepository myStudentRepo;


    @Test
    @Transactional
    @Rollback(value = false)
    public void saveToStudentRepoTest(){
        Address homeAddress = new Address();
        homeAddress.setCity("Orlando");
        homeAddress.setCountry("United States");
        homeAddress.setState("FL");
        homeAddress.setStreet("1614 Woodhaven Court");

        Student studentOne = new Student();
        studentOne.setName("Rohan Ayub");
        studentOne.setEmail("test@gmail.com");
        studentOne.setHomeAddress(homeAddress);
        myStudentRepo.save(studentOne);





       Student found = myStudentRepo.findOne(studentOne.getId());
        assertNotNull(found);



    }

}