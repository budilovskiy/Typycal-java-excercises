package com.felixfeatures.ex052;

import java.util.Arrays;
import java.util.Random;

/**
 * 52. В одномерном массиве с четным количеством элементов (2N) находятся координаты N точек плоскости.
 * Они располагаются в следующем порядке: x1, y1, х2, y2, x3, y3, и т.д.
 * Определить кольцо с центром в начале координат, которое содержит все точки.
 */
public class Main {


    public static void main(String[] args) {
        int numOfPoints = 5;
        int[] array = new int[numOfPoints * 2];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        circle(array);
    }

    public static void circle(int[] array) {
        double minRadius = Integer.MAX_VALUE;
        double maxRadius = 0;

        for (int i = 0; i < array.length / 2; i++) {
            double distance = Math.sqrt((array[i * 2] * array[i * 2]) + (array[(i * 2) + 1] * array[(i * 2) + 1]));
            if (distance > maxRadius) {
                maxRadius = distance;
            }
            if (distance < minRadius) {
                minRadius = distance;
            }
        }
        System.out.print("minRadius = " + minRadius + ", ");
        System.out.println("maxRadius = " + maxRadius);
    }

}
