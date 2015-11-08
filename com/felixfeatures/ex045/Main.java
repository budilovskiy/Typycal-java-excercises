package com.felixfeatures.ex045;

import java.util.Arrays;

/**
 * 45. Дан массив, состоящий из n натуральных чисел.
 * Образовать новый массив, элементами которого будут элементы исходного, оканчивающиеся па цифру k.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1005, 10, 15, 5, 25, 105, 103, 21};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(animalsFrequency(array, 5)));
    }

    public static int[] animalsFrequency(int[] array, int digit) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == digit) {
                counter++;
            }
        }
        
        int[] result = new int[counter];

        counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == digit) {
                result[counter++] = array[i];
            }
        }
        return result;
    }

}
