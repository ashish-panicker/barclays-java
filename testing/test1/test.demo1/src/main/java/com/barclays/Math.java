package com.barclays;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isPrimeNumber(int primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;

    }
}