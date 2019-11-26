package com.github.lucaguettinger;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Random;
import java.util.Scanner;

public class Helper {
    public static int getNumberFromUser() {
        int zahl1 = -1;

        Scanner scanner = new Scanner(System.in);

        while (zahl1 < 0) {
            try {
                zahl1 = Integer.parseInt(scanner.nextLine());
            }catch (NumberFormatException ex) {
                System.out.println("bitte geben sie eine Valide zahl ein die grösser als 0 ist.");
            }
        }
        return zahl1;
    }

    public static LocalDate getDateFromUser() {
        LocalDate date  = null;
        Scanner scanner = new Scanner(System.in);

        while (date == null) {
            try {
                date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd.MM.yyyy"));
            }catch (DateTimeParseException ex) {
                System.out.println("bitte geben sie ein valides Datum ein.");
            }
        }
        return date;
    }

    public static void printArr(String prefix,int[] arr, int start,int end) {
        StringBuilder sb = new StringBuilder(prefix);
        sb.append(arr[start]);
        for (int i = start+1; i < end; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }



    public static int[] generateArray(int amount) {
        int[] arr = new int[amount];

        for (int i = 0; i < amount; i++) {
            arr[i] = new Random().nextInt(1000);
        }
        return arr;
    }
}