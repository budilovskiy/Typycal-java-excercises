package com.felixfeatures.ex044;

import java.util.Arrays;

/**
 * 44. Японская радиокомпания провела опрос N радиослушателей по вопросу: "Какое животное Вы связываете с Японией
 * и японцами?" Составить программу получения k наиболее часто встречающихся ответов и их долей (в процентах).
 */
public class Main {

    public static void main(String[] args) {
        String[] array = {"dragon", "cat", "monkey", "monkey", "dragon", "cat", "mouse", "dragon", "eagle"};
        System.out.println(Arrays.toString(array));
        animalsFrequency(array, 3);
    }

    public static void animalsFrequency(String[] array, int limit) {

        int[] frequency = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j])) {
                    counter++;
                }
            }
            frequency[i] = counter;
        }

        for (int i = 0; i < limit; i++) {
            int maxIndex = findMaxIndex(frequency);
            System.out.println(array[maxIndex] + " : " + ((frequency[maxIndex] * 1.0) / array.length) * 100.0 + "%");
            frequency[maxIndex] = 0;
            removeFrequency(array, array[maxIndex], frequency);
        }
    }

    private static int findMaxIndex(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void removeFrequency(String[] animals, String animal, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (animals[i].equals(animal)) {
                array[i] = 0;
            }
        }
    }

}
