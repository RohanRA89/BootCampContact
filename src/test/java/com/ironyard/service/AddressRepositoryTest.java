package com.ironyard.service;

import com.ironyard.data.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AddressRepositoryTest {
    @Autowired
    private AddressRepository myAddressRepo;



@Test
    public void testMyAddressRepoSave(){

        Address homeAddress = new Address();
        homeAddress.setCity("Orlando");
        homeAddress.setCountry("United States");
        homeAddress.setState("FL");
        homeAddress.setStreet("1614 Woodhaven Court");
        myAddressRepo.save(homeAddress);
        Address found = myAddressRepo.findOne(homeAddress.getId());
        assertEquals(homeAddress.getCity(), found.getCity());

    Address workAddress = new Address();
    workAddress.setCity("Orlando");
    workAddress.setCountry("United States");
    workAddress.setState("FL");
    workAddress.setStreet("123 IronYard Way");
    myAddressRepo.save(workAddress);
    Address found2 = myAddressRepo.findOne(homeAddress.getId());
    assertEquals(workAddress.getCity(), found2.getCity());







    }
}