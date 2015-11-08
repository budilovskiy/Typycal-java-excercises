package com.felixfeatures.ex038;

import java.util.Arrays;

/**
 * 38. Дана последовательность целых чисел a1, a2, ..., аn.
 * Указать пары чисел аi, аj, таких, что аi + аj = m.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        sumOfPairs(array, 10);

    }

    public static void sumOfPairs(int[] array, int sum) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("a[" + i + "] = " + array[i] + ", a[" + j + "] = " + array[j]);
                }
            }
        }
    }
}
