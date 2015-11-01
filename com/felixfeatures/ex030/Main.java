package com.felixfeatures.ex030;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/**
 * 30. Дана последовательность целых чисел a1, a2, ..., аn.
 * Образовать новую последовательность, выбросив из исходной те члены, которые равны  min(a1, a2, ..., аn).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {10, 11, 10000, 12, 20, 100, 10, 1000, 18};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeMins(array)));
        System.out.println(Arrays.toString(funcRemoveMins(array)));
    }

    public static int[] removeMins(int[] array) {
        int counter = 0;
        int min = array[0];

        // find min element
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        // count min elements
        for (int element : array) {
            if (element == min) {
                counter++;
            }
        }

        // create new array
        int[] result = new int[array.length - counter];

        // filling result array
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[j++] = array[i];
            }
        }

        return result;
    }

    public static int[] funcRemoveMins(int[] array) {
        int min = Arrays.stream(array)
                .min()
                .getAsInt();
        return Arrays.stream(array)
                .filter(n -> n != min)
                .toArray();
    }

}
