package com.ironyard.service;

import com.ironyard.data.Address;
import com.ironyard.data.BootCamp;
import com.ironyard.data.Instructor;
import com.ironyard.data.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class InstructorRepositoryTest {
    @Autowired
    InstructorRepository myInstructorRepo;
    @Test
    public void saveToInstructorRepo(){
        Address homeAddress = new Address();
        homeAddress.setCity("Orlando");
        homeAddress.setCountry("United States");
        homeAddress.setState("FL");
        homeAddress.setStreet("1614 Woodhaven Court");

        Address homeAddressStu = new Address();
        homeAddressStu.setCity("Lebanon");
        homeAddressStu.setCountry("United States");
        homeAddressStu.setState("TN");
        homeAddressStu.setStreet("2007 Babbitt Court");


        Address workAddress = new Address();
        workAddress.setCity("Orlando");
        workAddress.setCountry("United States");
        workAddress.setState("FL");
        workAddress.setStreet("123 IronYard Way");

        Instructor teacher = new Instructor();
        teacher.setName("Rohan");
        teacher.setHireDate("March 15th 2015");
        teacher.setWorkAddress(workAddress);
        teacher.setHomeAddress(homeAddress);

        Student studentOne = new Student();
        studentOne.setName("Rohan Ayub");
        studentOne.setEmail("test@gmail.com");
        studentOne.setHomeAddress(homeAddressStu);


        BootCamp javaBootCamp = new BootCamp();
        javaBootCamp.setTeacher(teacher);
        javaBootCamp.setName("Java");
        javaBootCamp.setStudents((List<Student>) studentOne);
        javaBootCamp.setEndDate("March 31st 2017");


        teacher.setBootCampsTaught((List<BootCamp>) javaBootCamp);

        myInstructorRepo.save(teacher);

        assertNotNull(teacher.getWorkAddress());
    }

}