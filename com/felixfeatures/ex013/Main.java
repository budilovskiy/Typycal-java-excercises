package com.felixfeatures.ex013;

import java.util.Arrays;

/**
 * 13. В заданном одномерном массиве поменять местами соседние элементы, стоящие на четных местах, 
 * с элементами, стоящими на нечетных.
 */
public class Main {

    public static void main(String[] args) {
        Object[] array = {"zero", "one", "two", "three", "four", "five"};
        System.out.println(Arrays.toString(flipOddEvenIndexes(array)));
    }

    public static Object[] flipOddEvenIndexes(Object[] array) {
        Object temp;
        for (int i = 1; i < array.length; i = i + 2) {
            temp = array[i - 1];
            array[i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
