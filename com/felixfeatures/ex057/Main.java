package com.felixfeatures.ex057;

import java.util.Arrays;
import java.util.Random;

/**
 * 57. Дан одномерный массив чисел, среди элементов которого есть одинаковые.
 * Создать новый массив из различных элементов исходного массива.
 */
public class Main {

    public static void main(String[] args) {
        int numOfElements = 10;
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
        Arrays.fill(isUnique, true);

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (isUnique[i] && array[i] == array[j]) {
                    isUnique[j] = false;
                }
            }
        }

        int counter = 0;
        for (boolean unique : isUnique) {
            if (unique) {
                counter++;
            }
        }

        int[] result = new int[counter];
        int i = 0;
        for (int j = 0; j < isUnique.length; j++) {
            if (isUnique[j]) {
                result[i++] = array[j];
            }
        }

        return result;
    }

}
