package com.felixfeatures.ex046;

import java.util.Arrays;

/**
 * 46. Дан массив целых чисел. Найти в этом массиве минимальный элемент N и максимальный элемент M.
 * Получить в порядке возрастания все целые числа из интервала (N; М), которые не входят в данный массив.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {10, 15, 5, 25, 29, 23, 21};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        for (int i = array[0] + 1; i < array[array.length - 1]; i++) {
            if (Arrays.binarySearch(array, i) < 0) {
                System.out.print(i + " ");
            }
        }
    }

}
