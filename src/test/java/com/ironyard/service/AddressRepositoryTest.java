package com.ironyard.service;

import com.ironyard.data.Address;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
public class AddressRepositoryTest {
    @Autowired
    AddressRepository myAddressRepo;




    public void testMyAddressRepoSave(){

        Address homeAddress = new Address();
        homeAddress.setCity("Orlando");
        homeAddress.setCountry("United States");
        homeAddress.setState("FL");
        homeAddress.setStreet("1614 Woodhaven Court");
        myAddressRepo.save(homeAddress);

        Address workAddress = new Address();
        workAddress.setCity("Orlando");
        workAddress.setCountry("United States");
        workAddress.setState("FL");
        workAddress.setStreet("123 Pine Stree");
        myAddressRepo.save(workAddress);





    }
}