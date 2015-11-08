package com.felixfeatures.ex036;

import java.util.Arrays;

/**
 * 36. Задан массив, содержащий несколько нулевых элементов. Сжать его, выбросив эти элементы.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 0, 4, 0, 2, 1, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReduce(array)));
    }

    public static int[] arrayReduce(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }

        Arrays.fill(array, index, array.length, 0);
        return array;
    }
}
