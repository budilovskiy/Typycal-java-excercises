package com.felixfeatures.ex024;

import java.util.Arrays;

/**
 * 24. Даны действительные числа a1, a2, ..., аn. Среди них есть положительные и отрицательные.
 * Заменить нулями те числа, величина которых по модулю больше максимального числа (|ai| > max{a1, a2, ..., аn}).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 13, 1, -81, 12, -5, -47, 18, 40, 30, -1, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replaceByZeroIfGreaterThanMax(array)));
    }

    public static int[] replaceByZeroIfGreaterThanMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            max = element > max ? element : max;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = (Math.abs(array[i]) > max) ? 0 : array[i];
        }
        return array;
    }

}
