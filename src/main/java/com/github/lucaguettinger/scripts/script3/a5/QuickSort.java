package com.github.lucaguettinger.scripts.script3.a5;

import com.github.lucaguettinger.Helper;

public class QuickSort {

    public static void sort(int[] arr) {
        sortRecursive(arr, 0, arr.length - 1);
    }

    public static void sortRecursive(int[] arr, int startIndex, int endIndex) {
        if (endIndex - startIndex <= 0) {
            return;
        }

        int pivotIndex = partition(arr, startIndex, endIndex);

        if (pivotIndex == endIndex) {
            sortRecursive(arr, startIndex, pivotIndex - 1);
        } else if (pivotIndex == startIndex) {
            sortRecursive(arr, pivotIndex+1, endIndex);
        } else {
            sortRecursive(arr, pivotIndex+1, endIndex);
            sortRecursive(arr, startIndex, pivotIndex - 1);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivotIndex = end;

        for (int i = end - 1; i >= start; i--) {
            if (arr[i] >= arr[pivotIndex]) {
                if (pivotIndex - i != 1) {
                    Helper.swap(arr, i, pivotIndex - 1);
                    Helper.swap(arr, pivotIndex - 1, pivotIndex);
                    pivotIndex--;
                } else {
                    Helper.swap(arr, i, pivotIndex);
                    pivotIndex = i;
                }
            }
        }
        return pivotIndex;
    }

}
