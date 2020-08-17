package com.barclays;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private String id;
    private List<Passenger> passengerList = new ArrayList<>();
    private String flightType;

    public Flight(String id, String flightType) {
        this.id = id;
        this.flightType = flightType;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public List<Passenger> getPassengerList() {
        return passengerList;
    }

    public String getId() {
        return id;
    }

    public boolean addPassenger(Passenger passenger) {
        switch (flightType) {
            case "Economy":
                return passengerList.add(passenger);
            case "Business":
                if (passenger.isVip()) {
                    return passengerList.add(passenger);
                }
                return false;
            default:
                throw new RuntimeException("Unknown type: " + flightType);
        }
    }

    public boolean removePassgenger(Passenger passenger) {
        switch (flightType) {
            case "Economy":
                if (!passenger.isVip()) {
                    return passengerList.remove(passenger);
                }
                return false;

            case "Business":
                return false;
        
            default:
            throw new RuntimeException("Unknown type: " + flightType);
        }
    }
}