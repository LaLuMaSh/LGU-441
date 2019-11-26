package com.github.lucaguettinger.scripts.script3.a5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuickSortTest {
    @Test
    public void test_partition_1() {
        int[] arr = {9, 1, 2, 4, 3};

        int r = QuickSort.partition(arr, 0, arr.length - 1);
        assert r == 2;
    }

    @Test
    public void test_partition_2() {
        int[] arr = {1, 2, 2, 3};

        int r = QuickSort.partition(arr, 0, arr.length - 1);
        Assertions.assertEquals(3, r);
    }

    @Test
    public void test_sort_1() {
        int[] arr = {9, 1, 2, 4, 3};
        QuickSort.sort(arr);

        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 9}, arr);
    }

    @Test
    public void test_sort_2() {
        int[] arr = {9, 1, 2, 2, 4, 3};
        QuickSort.sort(arr);

        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 4, 9}, arr);
    }
}
