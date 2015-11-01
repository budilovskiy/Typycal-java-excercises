package com.felixfeatures.ex028;

import java.util.Arrays;

/**
 * 28. Дана последовательность действительных чисел a1 ≤ a2 ≤ ... ≤ аn.
 * Вставить действительное число b в нее так, чтобы последовательность осталась неубывающей.
 */
public class Main {

    public static void main(String[] args) {
        double[] array = {10.0, 11.0, 12.0, 12.0, 20.0, 15.0, 16.0, 17.0, 18.0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(replaceFirstMaxWithZero(array)));
    }

    public static double[] replaceFirstMaxWithZero(double[] array) {
        double[] result = Arrays.copyOf(array, array.length + 1);
        double max = array[0];
        for (double element : array) {
            if (element > max) {
                max = element;
            }
        }
        result[result.length - 1] = max + 1;
        return result;
    }

}
