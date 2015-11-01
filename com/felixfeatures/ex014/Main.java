package com.felixfeatures.ex014;

/**
 * 14. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене, ко второму не допускаются.
 * В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
 * Подсчитать, сколько человек не допущено ко второму экзамену.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 5, 4, 2, 3, 5, 2, 3, 3, 4, 2};
        System.out.println(countMarks(array));
    }

    public static long countMarks(int[] array) {
        long counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter += (array[i] > 2) ? 0 : 1;
        }
        return counter;
    }
}
