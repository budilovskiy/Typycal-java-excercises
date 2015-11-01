package com.felixfeatures.ex3;

/**
 * 3. Дана последовательность целых чисел a1, a2, ..., an.
 * Выяснить, какое число встречается раньше – положительное или отрицательное.
 */
public class Main {

    public static String positiveNegativeFirst(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return "positive";
            } else if (array[i] < 0) {
                return "negative";
            } else {
                continue;
            }
        }
        return "none"; // в случае, если массив состоит из нулей
    }

    public static void main(String[] args) {
        int[] array = {0, 0, 0};
        System.out.println(positiveNegativeFirst(array));
    }

}
