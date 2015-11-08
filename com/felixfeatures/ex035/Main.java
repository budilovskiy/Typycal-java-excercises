package com.felixfeatures.ex035;

import java.util.Arrays;

/**
 * 35. Дан целочисленный массив с количеством элементов n.
 * "Сожмите" массив, выбросив из него каждый второй элемент (дополнительный массив при этом не использовать).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayReduce(array)));
    }

    public static int[] arrayReduce(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[index] = array[i];
            index++;
        }

        Arrays.fill(array, index, array.length, 0);
        return array;
    }
}
