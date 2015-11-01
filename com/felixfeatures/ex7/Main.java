package com.felixfeatures.ex7;

import java.util.Arrays;

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
        System.out.println("Replacements: " + Arrays.stream(array)
                .filter(n -> n > element)
                .map(operand -> (operand > element) ? element : operand)
                .count());
        return Arrays.stream(array)
                .map(operand -> (operand > element) ? element : operand)
                .toArray();
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
