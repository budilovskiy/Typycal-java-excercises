package com.felixfeatures.ex012;

/**
 * 11. Даны натуральные числа a1, a2, ..., an.
 * Указать те, у которых остаток от деления на М равен L (0 ≤ L ≤ М – 1).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {2, 10, 15, -9, 0, 8, 11};
        printIfHasDivider(array, 2, 1);
    }

    public static void printIfHasDivider(int[] array, int divider, int remainder) {
        if (remainder < 0 || remainder >= divider) {
            System.out.println("Wrong pair of divider and remainder");
            return;
        }
        if (array != null) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] % divider == remainder ? array[i] + " " : "");
            }
        }
    }
}
