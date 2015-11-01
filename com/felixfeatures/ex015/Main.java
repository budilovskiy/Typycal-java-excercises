package com.felixfeatures.ex015;

/**
 * 15. Дана последовательность чисел, среди которых имеется один нуль.
 * Вывести на печать все числа, включительно до нуля.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {5, 5, 4, 2, 3, 5, 2, 3, 0, 4, 2};
        printSequence(array);
    }

    public static void printSequence(int[] array) {
        int i = 0;
        do {
            System.out.print(array[i++] + " ");
        }
        while (array[i - 1] != 0);
    }
}
