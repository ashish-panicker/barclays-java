package com.unit.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public class CalcTest {

    private static Calc c;

    // @Before
    // public void init(){
    //     c = new Calc();
    //     System.out.println("Cal object created...");
    // }

    // @After
    // public void tearDown(){
    //     System.out.println("Tear down()...");
    // }

    @BeforeClass
    public static void initClass() {
        c = new Calc();
        System.out.println("BeforeClass...");
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("AfterClass...");
    }


    @Test 
    public void testAddMethod() {
        assertEquals(5, c.add(3, 2));
    }

    @Test
    public void testPrimNumber() {
        assertTrue(c.isPrimeNumber(5));
        assertFalse(c.isPrimeNumber(6));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivMethod() {
        assertEquals(0, c.divide(3, 0));
    }

    @Test(timeout = 10)
    public void testLongMethod() {
        assertEquals(1, c.longMethod());
    }

}