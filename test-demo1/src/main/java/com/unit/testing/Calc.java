package com.unit.testing;

public class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public boolean isPrimeNumber(int primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;

    }

    public int divide(int n1, int n2) throws ArithmeticException {
        return n1 /n2;
    }

    public int longMethod(){
        long j = 0;
        for (long i = 0; i < 1000000000; i++) {
            j = i;
        }
        return 1;
    }
    
}