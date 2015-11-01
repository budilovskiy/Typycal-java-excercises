package com.felixfeatures.ex016;

/**
 * 16. В одномерном массиве размещены: в первых элементах значения аргумента, 
 * в следующих – соответствующие им значения функции. 
 * Напечатать элементы этого массива в параллельных столбцов (аргумент и значения функции).
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, -5, -2, 0, 2, 6};
        printFunctionValues(array);
    }

    public static void printFunctionValues(int[] array) {
        int mid = array.length / 2;
        for (int i = 0; i < mid; i++) {
            System.out.println(array[i] + "\t" + array[mid + i]);
        }
    }
}
