package com.ironyard.service;

import com.ironyard.data.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CompanyRepositoryTest {
    @Autowired
    private CompanyRepository myCompanyRepo;



    @Test
    @Transactional
    @Rollback(value = false)
    public void saveToCompanyRepo(){
        Address homeAddress = new Address();
        homeAddress.setCity("Orlando");
        homeAddress.setCountry("United States");
        homeAddress.setState("FL");
        homeAddress.setStreet("1614 Woodhaven Court");

        Address homeAddress2 = new Address();
        homeAddress2.setCity("Orlando");
        homeAddress2.setCountry("United States");
        homeAddress2.setState("FL");
        homeAddress2.setStreet("2007 Babbitt Court");

        Address workAddress = new Address();
        workAddress.setCountry("USA");
        workAddress.setCity("Orlando");
        workAddress.setStreet("1234 IronYard Way");
        workAddress.setState("FL");

        Instructor teacher = new Instructor();
        teacher.setName("Rohan");
        teacher.setHireDate("March 15th 2015");
        teacher.setWorkAddress(workAddress);
        teacher.setHomeAddress(homeAddress);

        Instructor teacher2 = new Instructor();
        teacher2.setName("Robert");
        teacher2.setHireDate("February 15th 2016");
        teacher2.setWorkAddress(workAddress);
        teacher2.setHomeAddress(homeAddress2);

        Student studentOne = new Student();
        studentOne.setEmail("rohanra89@gmail.com");
        studentOne.setName("Rohan");
        studentOne.setHomeAddress(homeAddress);

        BootCamp bootCampOne = new BootCamp();
        bootCampOne.setName("Iron Yard");
        bootCampOne.setStartDate("March 15th 2004");
        bootCampOne.setEndDate("July 15th 2004");
        bootCampOne.setStudents((List<Student>) studentOne);
        bootCampOne.setTeacher(teacher);
        bootCampOne.setTeacher(teacher2);


        Company companyOne = new Company();
        companyOne.setName("IronYard");
        companyOne.setPhone("407-324-1234");
        companyOne.setTeacher((List<Instructor>) teacher);
        companyOne.setTeacher((List<Instructor>) teacher2);
        //companyOne.setTypesOfBootCamps();
        companyOne.setWorkAddress(workAddress);
        companyOne.setTypesOfBootCamps((List<BootCamp>) bootCampOne);
        myCompanyRepo.save(companyOne);

        Company found = myCompanyRepo.findOne(companyOne.getId());
        assertNotNull(String.valueOf(found.getWorkAddress()));


    }

}