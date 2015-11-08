package com.felixfeatures.ex037;

import java.util.Arrays;

/**
 * 37. Задан массив с количеством элементов N.
 * Сформируйте два массива: в первый включите элементы исходного массива с четными номерами, а во второй – с нечетными.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));
        arraySplit(array);
    }

    public static void arraySplit(int[] array) {
        int[] evens = (array.length % 2 == 0) ? new int[array.length / 2] : new int[array.length / 2 + 1];
        int[] odds = new int[array.length - evens.length];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = array[i];
            } else {
                odds[oddIndex++] = array[i];
            }
        }

        System.out.println(Arrays.toString(evens));
        System.out.println(Arrays.toString(odds));
    }
}
