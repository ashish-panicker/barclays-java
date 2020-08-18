package com.barclays.day4.demo.controllers;

import java.util.Iterator;
import java.util.List;

import com.barclays.day4.demo.models.Employee;
import com.barclays.day4.demo.repos.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository empRepo;
   
    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee e) {
        empRepo.save(e);
        return e;
    }

    @GetMapping("/")
    public Iterable<Employee> getAll() {
        return empRepo.findAll();
    }

}