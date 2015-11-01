package com.felixfeatures.ex1;

import java.util.Arrays;

/**
 * 1. Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
 */
public class Main {

    public static int sum(int[] array, int number) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % number == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    public static int funcSum(int[] array, int number) {
        return Arrays.stream(array).filter(value -> value % number == 0).sum();
    }

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Sum is: " + funcSum(array, 5));
        System.out.println("Sum is: " + sum(array, 5));
    }

}
