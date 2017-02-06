package com.ironyard.service;

import com.ironyard.data.Instructor;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rohanayub on 2/5/17.
 */
public interface InstructorRepository extends CrudRepository<Instructor, Long>{
}
