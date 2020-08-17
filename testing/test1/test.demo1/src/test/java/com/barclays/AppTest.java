package com.barclays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.barclays.*;

/**
 * Unit test for simple App.mvn
 */

@Ignore
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    @Ignore
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    @Ignore
    public void testAddMethod() {
        Math m = new Math();
        assertEquals("Sum was not as expected", 7, m.add(3, 3));
    }

    Passenger ashish, arun;
    Flight econFlight, businessFlight;

    
    @Before
    public void prepareData() {

        ashish = new Passenger("Ashish", true);
        arun = new Passenger("Arun", false);

        econFlight = new Flight("1", "Economy");
        businessFlight = new Flight("2", "Business");

        System.out.println("Runnung before...");
    }

    @Test
    public void addAndRemoveNonVipPassengerToEconFlight() {

        assertEquals(true, econFlight.addPassenger(arun));
        assertEquals(true, econFlight.removePassgenger(arun));
        
    }

    @Test
    public void addAndRemoveNonVipPassengerToBusinessFlight() {

        assertEquals(false, businessFlight.addPassenger(arun));
        assertEquals(false, businessFlight.removePassgenger(arun));
    }

    @Test
    public void addAndRemoveVipPassengerToBusinessFlight() {
        assertEquals(true, businessFlight.addPassenger(ashish));
        assertEquals(false, businessFlight.removePassgenger(ashish));
    }

    @Test
    public void addAndRemoveVipPassengerToEconFlight() {
        assertEquals(true, econFlight.addPassenger(ashish));
        assertEquals(false, econFlight.removePassgenger(ashish));
    }

}
