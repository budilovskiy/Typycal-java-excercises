package com.felixfeatures.ex040;

import java.util.Arrays;

/**
 * 40. Даны целые числа а1, а2, ..., аn и b1, b2, ..., bn.
 * Преобразовать последовательность bl, b2, ..., bn по правилу: если аi ≤ 0, то bi увеличить в 10 раз,
 * иначе bi заменить нулем (i = 1, 2, ..., n).
 */
public class Main {

    public static void main(String[] args) {
        int[] arrayA = {2, 8, -8, 8, -8, 255, 2, 2, -2, 2, 8};
        int[] arrayB = {2, 8, 8, 8, 255, 2, 2, 2, 2, 8, 8};
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(bChange(arrayA, arrayB)));

    }

    public static int[] bChange(int[] arrayA, int[] arrayB) {
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] <= 0) {
                arrayB[i] *= 10;
            } else {
                arrayB[i] = 0;
            }
        }
        return arrayB;
    }
}
