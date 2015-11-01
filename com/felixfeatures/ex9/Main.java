package com.felixfeatures.ex9;

/**
 * 9. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 6, 2, 17, -6, 0, 8, 9, 7};
        countElements(array);
    }

    public static void countElements(int[] array) {
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;
        for (int i = 0; i < array.length; i++)
            if (array[i] > 0) {
                positiveCounter++;
            } else if (array[i] < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        System.out.printf("Positive : %d\nNegative : %d\nZeroes : %d", positiveCounter, negativeCounter, zeroCounter);
    }
}
