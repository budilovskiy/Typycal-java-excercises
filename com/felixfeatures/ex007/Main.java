package com.felixfeatures.ex7;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

/**
 * 7. Дана последовательность действительных чисел a1, a2, ..., an.
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 6, 2, 17, -6, 0};
        System.out.println(Arrays.toString(funcElementsReplacements(array1, 0)));
        int[] array2 = {1, 6, 2, 17, -6, 0};
        System.out.println(Arrays.toString(elementReplacement(array2, 0)));
    }

    public static int[] funcElementsReplacements(int[] array, int element) {
        final long[] counter = {0};

        IntUnaryOperator operator = operand -> {
            if (operand > element) {
                counter[0]++;
                return element;
            } else {
                return operand;
            }
        };

        int[] result =  Arrays.stream(array)
                .map(operator)
                .toArray();
        System.out.println("Replacements: " + counter[0]);
        return result;
    }

    public static int[] elementReplacement(int[] array, int element) {
        long counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > element) {
                array[i] = element;
                counter++;
            }
        }
        System.out.println("Replacements: " + counter);
        return array;
    }

}
