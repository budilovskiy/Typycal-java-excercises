package com.felixfeatures.ex4;

/**
 * 4. Дана последовательность действительных чисел a1, a2, ..., an.
 * Выяснить, будет ли она возрастающей.
 */
public class Main {

    public static boolean isAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {0, 8, 5};
        System.out.println(isAscending(array));
    }

}
