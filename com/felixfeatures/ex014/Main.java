package com.felixfeatures.ex014;

/**
 * 14. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене, ко второму не допускаются.
 * В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
 * Подсчитать, сколько человек не допущено ко второму экзамену.
 */
public class Main {

    public static void main(String[] args) {
        int[] marks = {5, 5, 4, 2, 3, 5, 2, 3, 3, 4, 2};
        System.out.println(countMarks(marks));
    }

    public static long countMarks(int[] marks) {
        long counter = 0;
        for (int mark : marks) {
            counter += (mark > 2) ? 0 : 1;
        }
        return counter;
    }
}
