package com.barclays.ms.model;

public class Employee {

    private String empId;
    private String name;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String empId, String name, String designation, double salary) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getEmpId() {
        return this.empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee empId(String empId) {
        this.empId = empId;
        return this;
    }

    public Employee name(String name) {
        this.name = name;
        return this;
    }

    public Employee designation(String designation) {
        this.designation = designation;
        return this;
    }

    public Employee salary(double salary) {
        this.salary = salary;
        return this;
    }

}