package com.tests.junittests;

import java.math.BigInteger;

public class Euler48 {

    public static void main(String[] args) {

        Euler48 euler48 = new Euler48();
        BigInteger sum = euler48.power(20);

        System.out.println(sum);
    }

    public BigInteger power(int border){
        BigInteger result = BigInteger.ZERO;

        for (int i = 1; i <= border; i++) {

            result = result.add(BigInteger.valueOf(i).pow(i));
        }
        return result;
    }
}
