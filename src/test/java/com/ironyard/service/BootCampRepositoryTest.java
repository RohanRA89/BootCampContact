package com.ironyard.service;

import com.ironyard.data.Address;
import com.ironyard.data.BootCamp;
import com.ironyard.data.Instructor;
import com.ironyard.data.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import static org.junit.Assert.*;
/**
 * Created by rohanayub on 2/5/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class BootCampRepositoryTest {
    @Autowired
    BootCampRepository myBootCampRepo;

   @Test
   @Transactional
   @Rollback(value = false)
public void saveToBootCampRepo(){

       Address homeAddress = new Address();
       homeAddress.setCity("Orlando");
       homeAddress.setCountry("United States");
       homeAddress.setState("FL");
       homeAddress.setStreet("1614 Woodhaven Court");

       Address homeAddressTeach = new Address();
       homeAddressTeach.setCity("Tampa");
       homeAddressTeach.setCountry("United States");
       homeAddressTeach.setState("FL");
       homeAddressTeach.setStreet("123 Hello Court");

       Student studentOne = new Student();
       studentOne.setEmail("rohanra89@gmail.com");
       studentOne.setName("Rohan");
       studentOne.setHomeAddress(homeAddress);

       Address workAddress = new Address();
       workAddress.setCity("Orlando");
       workAddress.setCountry("United States");
       workAddress.setState("FL");
       workAddress.setStreet("123 IronYard Way");

       Instructor teacherOne = new Instructor();
       teacherOne.setHomeAddress(homeAddressTeach);
       teacherOne.setWorkAddress(workAddress);
       teacherOne.setName("Jared");
       teacherOne.setHireDate("March 15th 2015");

       BootCamp bootCampOne = new BootCamp();
       bootCampOne.setName("Iron Yard");
       bootCampOne.setStartDate("March 15th 2004");
       bootCampOne.setEndDate("July 15th 2004");
       bootCampOne.setStudents(studentOne);
       bootCampOne.setTeacher(teacherOne);

   myBootCampRepo.save(bootCampOne);
   assertNotNull(bootCampOne);
   }
}
