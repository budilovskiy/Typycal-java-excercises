package com.felixfeatures.ex022;

/**
 * 22. Дана последовательность целых положительных чисел.
 * Найти произведение только тех чисел, которые больше заданного числа М.
 * Если таких нет, то выдать сообщение об этом.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        productIfGreater(array, 40);
        productIfGreater(array, 25);
    }

    public static void productIfGreater(int[] array, int min) {
        long result = 1;
        boolean isFound = false;
        for (int element : array) {
            if (element > min) {
                result *= element;
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("There is no elements greater than " + min);
        } else {
            System.out.println("Product is: " + result);
        }
    }
}
