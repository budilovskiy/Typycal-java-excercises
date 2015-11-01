package com.felixfeatures.ex020;

/**
 * 20. Дан одномерный массив A[N]. Найти: mаx(а2, а4, ..., a2k) + min(а1, а3, …, a2k-1).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36};
        System.out.println(minMaxSum(array, 10));
    }

    public static int minMaxSum(int[] array, int limit) {
        limit *= 2;
        if (limit > array.length) {
            limit = array.length;
        }
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < limit; i++) {
            maxIndex = array[i] > array[maxIndex] ? i : maxIndex;
        }

        for (int i = 0; i < limit - 1; i++) {
            minIndex = array[i] < array[minIndex] ? i : minIndex;
        }
        return array[maxIndex] + array[minIndex];
    }
}
