package com.felixfeatures.ex049;

import java.util.Arrays;

/**
 * 49. Напишите программу, входными данными которой является возраст n человек.
 * Программа подсчитывает количество людей, возраст которых находится в интервале 10 лет, а именно:
 * <..> человек имеет возраст в диапазоне 0 – 10 лет;
 * <..> человек имеет возраст в диапазоне 10 – 20 лет и т.д.
 */
public class Main {

    private final static int MAX_AGE = 100;

    public static void main(String[] args) {
        int[] array = {25, 32, 3, 3, 5, 89, 5, 15, 90, 1};
        System.out.println(Arrays.toString(array));
        int numOfRanges = 10;
        System.out.println(Arrays.toString(ageRanges(array, numOfRanges)));

    }

    public static int[] ageRanges(int[] ages, int numOfRanges) {
        int minRangeAge;
        int maxRangeAge;
        int[] result = new int[numOfRanges];
        for (int i = 0; i < numOfRanges; i++) {
            minRangeAge = MAX_AGE * i / numOfRanges;
            maxRangeAge = MAX_AGE * i / numOfRanges + (MAX_AGE / numOfRanges - 1);
            int counter = 0;
            for (int j = 0; j < ages.length; j++) {
                if ((ages[j] >= minRangeAge) && (ages[j] <= maxRangeAge)) {
                    counter++;
                }
            }
            result[i] = counter;
            System.out.printf("%2d - %2d: %2d\n", minRangeAge, maxRangeAge, counter);
        }
        return result;
    }


}
