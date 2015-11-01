package com.felixfeatures.ex8;

/**
 * 8. Последовательность действительных чисел оканчивается нулем.
 * Найти количество членов этой последовательности.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 6, 2, 17, -6, 0, 8, 9, 7};
        System.out.println(sequenceLength(array, 0));  // 6, including 0
    }

    public static long sequenceLength(int[] array, int endElement) {
        long counter = 0;
        for (int i = 0; i < array.length; i++) {
            counter++;
            if (array[i] == endElement) {
                break;
            }
        }
        return counter;
    }

}
