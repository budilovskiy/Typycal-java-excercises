package com.felixfeatures.ex043;

import java.util.Arrays;

/**
 * 43. Дан массив чисел.
 * Найти сумму элементов массива, расположенных между минимальным и максимальным элементами включительно.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {9, 2, 2, 5, 1, 8, 7};
        System.out.println(Arrays.toString(array));
        findSumBetweenMinAndMax(array);
    }

    public static int findSumBetweenMinAndMax(int[] array) {
        int sum = 0;
        int minIndex = findMinIndex(array);
        int maxIndex = findMaxIndex(array);
        if (minIndex <= maxIndex) {
            for (int i = minIndex; i <= maxIndex; i++) {
                if (i != minIndex) {
                    System.out.print(" + ");
                }
                System.out.print(array[i]);
                sum += array[i];
            }
        } else {
            for (int i = maxIndex; i <= minIndex; i++) {
                if (i != maxIndex) {
                    System.out.print(" + ");
                }
                System.out.print(array[i]);
                sum += array[i];
            }
        }
        System.out.print(" = " + sum);
        return sum;
    }

    private static int findMinIndex(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[min]) {
                min = i;
            }
        }
        return min;
    }

    private static int findMaxIndex(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

}
