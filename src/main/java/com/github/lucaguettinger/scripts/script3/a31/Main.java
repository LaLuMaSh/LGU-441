package com.github.lucaguettinger.scripts.script3.a31;


import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = new Random().nextInt(1000);
        }

        for (int i : arr) {
            System.out.println("i:" + i);
        }

        System.out.println(Collections.min(Arrays.asList(arr)));
        System.out.println(Collections.max(Arrays.asList(arr)));
    }
}
