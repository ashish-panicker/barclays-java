package com;

import com.barclays.PersonCannotVoteException;

import org.w3c.dom.NameList;

public class Person {
    

    private int age;

    private String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void checkAge() throws PersonCannotVoteException{
        if(age < 18){
            throw new PersonCannotVoteException("Person cannot vote.");
        }
    }
}