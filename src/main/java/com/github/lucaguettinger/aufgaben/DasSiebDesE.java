package com.github.lucaguettinger.aufgaben;

import com.github.lucaguettinger.Helper;

import java.util.ArrayList;
import java.util.List;

public class DasSiebDesE {

    public static void main(String[] args) {
        System.out.println("Geben sie die Anzahl an Zahlen an:");

        int amount = Helper.getNumberFromUser();

        for (Integer number : getNumbers(amount)) {
            System.out.println(number);
        }
    }

    private static List<Integer> getNumbers(int amountOfNumbers) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 2; i < amountOfNumbers; i++) {
            numbers.add(i);
        }

        for (int i = 2; i < (amountOfNumbers / 2); i++) {
            if (!numbers.contains(i)) {
                continue;
            }

            removeNumbers(numbers, i);
        }
        return numbers;
    }

    private static void removeNumbers(ArrayList<Integer> list, int number) {
        ArrayList<Integer> toRemove = new ArrayList<Integer>();

        for (Integer integer : list) {
            if (integer == number) {
                continue;
            }
            if (integer % number == 0) {
                toRemove.add(integer);
            }
        }
        list.removeAll(toRemove);
    }
}