package com.tests.junittests;

public class Euler2 {

    public static void main(String[] args) {

        Euler2 euler2 = new Euler2();
        int sum = euler2.fibonacci(4_000_000);
        System.out.println("Suma wynosi: " + sum);
    }


    public int fibonacci(int bound) {

        int firstNum = 0;
        int secondNum = 1;
        int evenSum = 0;
        int num = firstNum + secondNum;


        while (num < bound) {

            firstNum = secondNum;
            secondNum = num;
            num = firstNum + secondNum;
            if (num % 2 == 0) {
                evenSum += num;
            }
        }

        return evenSum;
    }
}
