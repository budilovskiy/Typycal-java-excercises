package com.felixfeatures.ex053;

import java.util.Arrays;
import java.util.Random;

/**
 * 53. В одномерном массиве с четным количеством элементов (2N) находятся координаты N точек плоскости.
 * Они располагаются в следующем порядке: x1, y1, х2, y2, x3, y3, и т.д. (xi, yi – целые).
 * Определить номера точек, которые могут являться вершинами квадрата.
 */
public class Main {


    public static void main(String[] args) {
        int numOfPoints = 10;
        int[] array = new int[numOfPoints * 2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        squareTops(array);
    }

    public static void squareTops(int[] array) {
        for (int i = 0; i < array.length - 2; i = i + 2) {
            for (int j = i + 2; j < array.length; j = j + 2) {
                if (array[i] == array[j]) {
                    System.out.printf("Points #%d and #%d may be tops of the square\n", (i / 2) + 1, (j / 2) + 1);
                } else if (array[i + 1] == array[j + 1]) {
                    System.out.printf("Points #%d and #%d may be tops of the square\n", (i / 2) + 1, (j / 2) + 1);
                }
            }
        }
    }

}
