package com.ironyard.service;

import com.ironyard.data.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rohanayub on 2/5/17.
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
}
