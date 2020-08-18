package com.barclays.day4.demo.repos;

import com.barclays.day4.demo.models.Employee;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, String>{
    
}