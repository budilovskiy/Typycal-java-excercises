package com.felixfeatures.ex011;

/**
 * 11. Даны целые числа a1 a2, .... аn.
 * Вывести на печать только те числа, для которых выполняется условие аi ≤ i.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {2, 10, 15, -9, 0, 8, 11};
        printIfSmallerThanIndex(array);
    }

    public static void printIfSmallerThanIndex(int[] array) {
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] <= i) {
                    System.out.print(array[i] + " ");
                }
            }
        }
    }
}
