package com.barclays;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.matchers.JUnitMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MathTest {

    private Integer inputNumber;
    private Boolean expectedResult;
    private Math mathObj;

    @Before
    public void initialize() {
        mathObj = new Math();
    }

    public MathTest(Integer inputNumber, Boolean expectedResult) {
        this.inputNumber = inputNumber;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][] { { 2, true }, { 6, false }, { 19, true }, { 22, false }, { 23, true } });
    }

    @Test
    public void testPrimeNumberChecker() {
        System.out.println("Parameterized Number is : " + inputNumber);
         assertEquals(expectedResult, mathObj.isPrimeNumber(inputNumber));

        assertThat(mathObj.isPrimeNumber(inputNumber), is(expectedResult));

 
    }

}