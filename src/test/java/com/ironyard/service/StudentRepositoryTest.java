package com.ironyard.service;

import com.ironyard.data.Student;
import com.ironyard.data.Address;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
public class StudentRepositoryTest {
    @Autowired
    StudentRepository myStudentRepo;

    @Autowired
    AddressRepository myAddressRepo;

    public void saveToStudentRepoTest(){
        Student studentOne = new Student();
        studentOne.setName("Rohan Ayub");
        studentOne.setEmail("test@gmail.com");



        Address homeAddress = new Address();
        homeAddress.setCity("Orlando");
        homeAddress.setCountry("United States");
        homeAddress.setState("FL");
        homeAddress.setStreet("1614 Woodhaven Court");
        myAddressRepo.save(homeAddress);


        //studentOne.getHomeAddress(myAddressRepo.homeAddress



    }

}