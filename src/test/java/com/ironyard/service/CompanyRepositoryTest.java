package com.ironyard.service;

import com.ironyard.data.Company;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by rohanayub on 2/5/17.
 */
public class CompanyRepositoryTest {
    @Autowired
    CompanyRepository myCompanyRepo;

    public void saveToCompanyRepo(){
        Company companyOne = new Company;
        companyOne.setName("IronYard");
        companyOne.setPhone("407-324-1234");
        companyOne.setTeacher();
        companyOne.setTypesOfBootCamps();
        companyOne.setWorkAddress();

    }

}