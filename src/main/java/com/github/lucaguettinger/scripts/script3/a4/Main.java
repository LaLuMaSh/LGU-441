package com.github.lucaguettinger.scripts.script3.a4;

import com.github.lucaguettinger.Helper;

public class Main {
    public static void main(String[] args) {
        int[] arr = Helper.generateArray(10000);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        long x = System.currentTimeMillis();
        bubbleSort(arr); //bei 100'000 einträgen dauert es ca. 17.4 Sekunden, bei 10'000 250 ms.
        System.out.println(System.currentTimeMillis()-x);
        System.out.println("==");
        for (int i : arr) {
            System.out.println(i);
        }
    }


    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean changed = false;
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1]) {
                    changed = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            if (!changed) {
                return;
            }
        }
    }
}
