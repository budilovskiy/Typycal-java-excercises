package com.felixfeatures.ex6;

import java.util.Arrays;

/**
 * 6. Дана последовательность чисел a1, a2, ..., an.
 * Указать наименьшую длину числовой оси, содержащую все эти числа.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 6, 2, 17, -6, 0};
        System.out.println(minAxisLength(array));
        System.out.println(funcMinAxisLength(array));
    }

    public static int funcMinAxisLength(int[] array) {
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        return Math.abs(min) + max;
    }

    public static int minAxisLength(int[] array) {
        Arrays.sort(array);
        return Math.abs(array[0]) + array[array.length - 1];
    }

}
