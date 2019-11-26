package com.github.lucaguettinger.aufgaben;

import com.github.lucaguettinger.Helper;

import java.math.BigInteger;

public class GCD {

    public static void main(String[] args) {
        System.out.println("geben sie die erste Zahl ein:");

        int n1 = Helper.getNumberFromUser();
        System.out.println("bitte geben sie die zweite zahl ein:");
        int n2 = Helper.getNumberFromUser();

        System.out.println("das ggt der zahlen " + n1  + " und " + n2 + " ist " + calculateGgt(n1, n2));
    }





    /**
     * a alternative method for calculating the gcd.
     */
    private static BigInteger calculateGcd(int n1, int n2) {
        BigInteger b1 = BigInteger.valueOf(n1);
        BigInteger b2 = BigInteger.valueOf(n2);
        return b1.gcd(b2);
    }

    private static int calculateGgt(int number1, int number2) {
        while (number2 != 0) {
            if (number1 > number2) {
                number1 = number1 - number2;
            } else {
                number2 = number2 - number1;
            }
        }
        return number1;
    }
}
