package com.felixfeatures.ex057;

import java.util.Arrays;
import java.util.Random;

/**
 * 57. Дан одномерный массив чисел, среди элементов которого есть одинаковые.
 * Создать новый массив из различных элементов исходного массива.
 */
public class Main {

    public static void main(String[] args) {
        int numOfElements = 35;
        int[] array = new int[numOfElements];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(UniqueElementsCount(array)));
    }

    public static int[] UniqueElementsCount(int[] array) {
        boolean[] isUnique = new boolean[array.length];
        int[] result = new int[getUniqueCounter(array, isUnique)];
        int i = 0;
        for (int j = 0; j < array.length; j++) {
            if (isUnique[j]) {
                result[i++] = array[j];
            }
        }

        return result;
    }

    private static int getUniqueCounter(int[] array, boolean[] isUnique) {
        Arrays.fill(isUnique, true);
        int counter = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isUnique[i] && array[i] == array[j]) {
                    isUnique[j] = false;
                    counter--;
                }
            }
        }
        return counter;
    }

}
