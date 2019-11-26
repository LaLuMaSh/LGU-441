package com.github.lucaguettinger.scripts.script1.u6;

import com.github.lucaguettinger.Helper;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AgeCalculator calculator = new AgeCalculator();

        System.out.println("geben sie ihr geburtsdatum ein:");
        LocalDate birthday = Helper.getDateFromUser();

        System.out.println("sie sind " + calculator.calculateAge(birthday, LocalDate.now()) + " Jahre alt.");


    }
}
