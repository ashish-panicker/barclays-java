package com.barclays;

public class Airport {
    
    public static void main(String[] args) {

        Passenger ashish = new Passenger("Ashish", true);
        Passenger arun = new Passenger("Arun", false);

        Flight econFlight = new Flight("1", "Economy");
        Flight businessFlight = new Flight("2", "Business");

        businessFlight.addPassenger(ashish);
        businessFlight.removePassgenger(ashish);

        econFlight.addPassenger(arun);
        businessFlight.addPassenger(arun);


        System.out.println("Business flights...");
        for (Passenger passenger : businessFlight.getPassengerList()) {
            System.out.println("Passenger: " + passenger.getName());
        }

        System.out.println("Econ flights...");
        for (Passenger passenger : econFlight.getPassengerList()) {
            System.out.println("Passenger: " + passenger.getName());
        }

    }
}