package com.felixfeatures.ex055;

import java.util.Arrays;
import java.util.Random;

/**
 * 55. Задан целочисленный массив размерности N.
 * Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.
 */
public class Main {

    private static final int N = 1000;

    public static void main(String[] args) {
        int numOfElements = 10;
        int[] array = new int[numOfElements];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(N);
        }
        System.out.println(Arrays.toString(array));
        printPrimeNumbers1(array);
        System.out.println();
        printPrimeNumbers2(array);
    }

    public static void printPrimeNumbers1(int[] array) {
        // iterating dividers
        for (int i = 0; i < array.length; i++) {
            if (findDividersNum(array[i]) == 0) {
                System.out.println(i + ": " + array[i]);
            }
        }
    }

    private static int findDividersNum(int i) {
        int counter = 0;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void printPrimeNumbers2(int[] array) {
        boolean[] isPrime = createArrayOfPrimes();
        for (int i = 0; i < array.length; i++) {
            if (isPrime[array[i]]) {
                System.out.println(i + ": " + array[i]);
            }
        }
    }

    private static boolean[] createArrayOfPrimes() {
        // the sieve of Eratosthenes
        boolean isPrime[] = new boolean[N];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                for (int j = 2; i * j < isPrime.length; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        return isPrime;
    }

}
