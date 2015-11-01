package com.felixfeatures.ex029;

/**
 * 29. Даны целые положительные числа а1, а2, ..., an.
 * Найти среди них те, которые являются квадратами некоторого числа m.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {10, 11, 10000, 12, 20, 100, 4, 1000, 18};
        squaresOfNumber(array, 2);
    }

    public static void squaresOfNumber(int[] array, int number) {
        double delta = 0.001;
        for (int element : array) {
            double n = Math.sqrt(element);
            if (n > number - delta && n < number + delta) {
                System.out.print(element + " ");
            }
        }
    }

}
