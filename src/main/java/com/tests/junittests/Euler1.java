package com.tests.junittests;

public class Euler1 {

    public static void main(String[] args) {

        Euler1 euler1 = new Euler1();
        int calc = euler1.calc(100);
        System.out.println(calc);
    }


    public int calc(int border) {

        int sum = 0;

        for (int i = 0; i < border; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}



