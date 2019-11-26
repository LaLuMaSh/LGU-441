package com.github.lucaguettinger.scripts.script3.a5;

import com.github.lucaguettinger.Helper;

public class Main {
    public static void main(String[] args) {
        int[] arr = Helper.generateArray(100000);
        long l = System.currentTimeMillis();
        QuickSort.sort(arr);
        System.out.println(System.currentTimeMillis()-l);

        l = System.currentTimeMillis();
        Helper.printArr("r: ", arr, 0, arr.length);
        System.out.println(System.currentTimeMillis()-l);
    }


}
