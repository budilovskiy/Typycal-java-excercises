package com.felixfeatures.ex021;

/**
 * 21. Дана последовательность действительных чисел a1, a2, ..., аn.
 * Указать те ее элементы, которые принадлежат отрезку [с, d].
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        isInRange(array, 10, 20);
    }

    public static void isInRange(int[] array, int min, int max) {
        for (int element : array) {
            System.out.print((element >= min && element <= max) ? element + " " : "");
        }
    }
}
