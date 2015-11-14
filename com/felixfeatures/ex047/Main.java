package com.felixfeatures.ex047;

import java.util.Arrays;

/**
 * 47. Дано действительное число x и массив A[n].
 * В массиве найти два члена, среднее арифметическое которых ближе всего к x.
 */
public class Main {

    public static void main(String[] args) {
        double num = 6.3;
        double[] array = {7.6, 3.6, 15.0, 5.9, 25.1, 5.2, 3.3, 21.8, 14.2, 2.6};
        System.out.println(Arrays.toString(array));
        findClosestAverage(num, array);

    }

    public static void findClosestAverage(double number, double[] array) {
        double average;
        double[] buffer = new double[2];
        double delta = number;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                average = (array[i] + array[j]) / 2;
                if (Math.abs(average - number) < delta) {
                    delta = Math.abs(average - number);
                    buffer[0] = array[i];
                    buffer[1] = array[j];
                }
            }
        }

        System.out.printf("Number = %.4f, element 1 = %.4f, element 2 = %.4f, average= %.4f", number, buffer[0], buffer[1],
                (buffer[0] + buffer[1]) / 2);
    }

}
