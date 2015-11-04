package com.felixfeatures.ex033;

/**
 * 33. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
 * Если таких чисел несколько, то определить наименьшее из них.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {10, 10, 1, 1, 2, 2, 3, 3, 4, 4};
        printNumberFrequency(array);
    }

    public static void printNumberFrequency(int[] array) {
        int[] freq = new int[array.length];
        int globalFreqCounter = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    counter++;
                }
            }
            freq[i] = counter;
            if (counter > globalFreqCounter) {
                globalFreqCounter = counter;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == globalFreqCounter && array[i] < result) {
                result = array[i];
            }
        }

        System.out.println(result);
    }
}
