package com.felixfeatures.ex038;

import java.util.Arrays;

/**
 * 38. Дана последовательность целых чисел a1, a2, ..., аn.
 * Указать пары чисел аi, аj, таких, что аi + аj = m.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {2, 8, 8, 8, 8, 2, 2, 2, 2, 2, 8};
        System.out.println(Arrays.toString(array));
        sumOfPairs(array, 10);

    }

    public static void sumOfPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.printf("a[%d] = %d, a[%d] = %d\n", i, array[i], j, array[j]);
                }
            }
        }
    }
}
