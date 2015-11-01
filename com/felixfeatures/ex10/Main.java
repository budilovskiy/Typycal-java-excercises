package com.felixfeatures.ex10;

import java.util.Arrays;

/**
 * 10. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = null;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(flipMinMax(array)));
    }

    public static int[] flipMinMax(int[] array) {
        if (array != null) {
            int minIndex = 0;
            int maxIndex = 0;
            // define indexes of min and max elements
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            // flip min and max elements
            int temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
}
