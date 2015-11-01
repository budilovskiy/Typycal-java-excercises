package com.felixfeatures.ex019;

/**
 * 19. Дан целочисленный массив с количеством элементов n.
 * Напечатать те его элементы, индексы которых являются степенями двойки (1, 2, 4, 8, 16, ...).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        printPowersOfTwo(array);
    }

    public static void printPowersOfTwo(int[] array) {
        for (int number : array) {
            System.out.print(number >> Integer.numberOfTrailingZeros(number) == 1 ? number + " " : "");
        }
    }
}
