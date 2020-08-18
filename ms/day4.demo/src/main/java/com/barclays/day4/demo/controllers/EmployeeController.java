package com.barclays.day4.demo.controllers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.barclays.day4.demo.models.Employee;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static List<Employee> employees = new LinkedList<>(

            Arrays.asList(new Employee("e01", "Ashish", "Consultant"), new Employee("e02", "Arun", "Engineer"),
                    new Employee("e04", "Rahul", "Specialist")));

    @PostMapping("/")
    public Employee createEmployee(@RequestBody Employee e) {

        employees.add(e);
        return e;
    }

    @GetMapping("/{id}")
    public Employee findOne(@PathVariable String id) {
        return employees.stream().filter(emp -> id.equals(emp.getEmployeeId())).findFirst().orElse(null);
    }

    @DeleteMapping("/{id}")
    public List<Employee> findAndDelete(@PathVariable String id) {
        employees.removeIf(emp -> emp.getEmployeeId().equals(id));
        return employees;
    }

    @GetMapping("/")
    public List<Employee> getAll() {
        return employees;
    }

}