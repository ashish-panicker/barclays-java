package com.unit.testing;

public class Person {

    private int age;

    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEligible() throws InvalidAgeException{
        if (age >= 18){
            return true;
        }else{
            throw new InvalidAgeException("Person is not eligible to vote");
        }
            
    }

}