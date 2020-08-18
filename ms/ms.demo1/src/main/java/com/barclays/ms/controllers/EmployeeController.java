package com.barclays.ms.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

import com.barclays.ms.model.Employee;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private static List<Employee> employees = new LinkedList<>(Arrays.asList(
            new Employee("e001", "Ashish", "Consultant", 30000), new Employee("e002", "Arun", "Devops Engineer", 35000),
            new Employee("e003", "Jacob", "Admin", 40000), new Employee("e004", "Rahul", "Analyst", 30000),
            new Employee("e005", "Marting", "HR", 24000)));

    @GetMapping("/")
    public List<Employee> findAll() {
        return employees;
    }

    @GetMapping("/{id}")
    public Employee findOne(@PathVariable String id) {
        return employees.stream().filter(emp -> id.equals(emp.getEmpId())).findFirst().orElse(null);
    }

    @DeleteMapping("/{id}")
    public List<Employee> findAndDelete(@PathVariable String id) {
        employees.removeIf(emp -> emp.getEmpId().equals(id));
        return employees;
    }

    @PostMapping("/")
    public List<Employee> insertEmployee(@RequestBody Employee e){
        employees.add(e);
        return employees;
    }
}