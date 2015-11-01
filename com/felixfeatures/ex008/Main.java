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

    public static int sequenceLength(int[] array, int endElement) {
        int counter = 0;
        while (array[counter] != endElement) {
            counter++;
        }
        return counter;
    }
}
