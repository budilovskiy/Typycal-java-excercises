package com.felixfeatures.ex042;

import java.util.Arrays;
import java.util.Random;

/**
 * 42. Даны координаты n точек на плоскости: (Х1, Y2), ..., (Хn, Yn) (n ≤ 30).
 * Найти номера пары точек, расстояние между которыми наибольшее (считать, что такая пара единственная).
 */
public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Point[] array = new Point[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Point(random.nextInt(20), random.nextInt(20));
        }
        System.out.println(Arrays.toString(array));
        findMaxDistance(array);
    }

    public static void findMaxDistance(Point[] array) {
        Point[] result = new Point[2];
        double distance = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                double dX = array[i].getX() - array[j].getX();
                double dY = array[i].getY() - array[j].getY();
                double currentDistance = Math.sqrt((dX * dX) + (dY * dY));
                if (currentDistance > distance) {
                    distance = currentDistance;
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }
        System.out.println(Arrays.toString(result) + " : " + distance);
    }

}
