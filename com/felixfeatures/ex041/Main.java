package com.felixfeatures.ex041;

import java.util.Arrays;

/**
 * 41. Даны действительные числа а1, а2, ..., an.
 * Требуется умножить все члены последовательности а1, а2, ..., an на квадрат ее наименьшего члена, если ak ≥ 0,
 * и на квадрат ее наибольшего члена, если ak ≤ 0 (1 ≤ k ≤ n).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {2, 8, -2, 8, -8, 10, 2, 2, -2, 2, 8};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(product(array)));

    }

    public static int[] product(int[] array) {
        int min = findMin(array);
        int max = findMax(array);
        for (int i = 0; i < array.length; i++) {
            array[i] *= (array[i] > 0) ? (min * min) : (max * max);
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static int findMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
