package com.github.lucaguettinger.scripts.script3.a32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] arr = new String[10];

        System.out.println("geben sie 10 Zeilen ein:");
        for (int i = 0; i < 10; i++) {
            move(arr);
            arr[0] = new Scanner(System.in).nextLine();
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void move(Object[] array) {
        if (array.length == 1) {
            array[0] = null;
            return;
        }

        for (int i = array.length - 1; i >= 1; i--) {
            array[i] = array[i - 1];
        }
    }

}
