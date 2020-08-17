package com.unit.testing.mocks;

public class RecordService {

    DatabaseDAO database;
    
    NetworkDao network;

    // setters and getters

    public boolean save(String fileName) {
        database.save(fileName);
        System.out.println("Saved in database in Main class");

        network.save(fileName);
        System.out.println("Saved in network in Main class");

        return true;
    }
}