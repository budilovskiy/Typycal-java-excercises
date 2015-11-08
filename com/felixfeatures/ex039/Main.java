package com.felixfeatures.ex039;

import java.util.Arrays;

/**
 * 39. Даны целые числа a1, a2, ..., аn.
 * Наименьший член этой последовательности заменить целой частью среднего арифметического всех членов,
 * остальные члены оставить без изменения.
 * Если в последовательности несколько наименьших членов, то заменить последний по порядку.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {2, 8, 8, 8, 8, 255, 2, 2, 2, 2, 8};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replaceMinByAverage(array)));

    }

    public static int[] replaceMinByAverage(int[] array) {
        int minIndex = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[minIndex]) {
                minIndex = i;
            }
            sum += array[i];
        }
        array[minIndex] = sum / array.length;
        return array;
    }
}
