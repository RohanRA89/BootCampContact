package com.ironyard.service;

import com.ironyard.data.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rohanayub on 2/5/17.
 */
public interface CompanyRepository extends CrudRepository<Company, Long> {
}
