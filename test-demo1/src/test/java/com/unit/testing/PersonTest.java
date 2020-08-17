package com.unit.testing;

import static org.junit.Assert.*;

import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

@Ignore
public class PersonTest {


    @Test //(expected = InvalidAgeException.class)
    public void testPersonEligibility() throws InvalidAgeException {
        Person p = new Person(22, "Arun");

        // assertThat(p.isEligible(), is(true));

        assertTrue(p.isEligible());

    }
    
}