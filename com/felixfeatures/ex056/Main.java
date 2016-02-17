package com.felixfeatures.ex056;

import java.util.Arrays;
import java.util.Random;

/**
 * 56. Дан одномерный массив чисел. Найти количество различных чисел этого массива.
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
        System.out.println(uniqeElementsCount(array));
    }

    public static int uniqeElementsCount(int[] array) {
        boolean[] isUnique = new boolean[array.length];
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
