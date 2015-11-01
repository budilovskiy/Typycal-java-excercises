package com.felixfeatures.ex023;

import java.util.Arrays;

/**
 * 23. Последовательность a1, a2, ..., аn состоит из нулей и единиц.
 * Поставить в начало этой последовательности нули, а затем единицы.
 */
public class Main {

    public static void main(String[] args) {
        byte[] array = {0, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(sort(array)));
    }

    public static byte[] sort(byte[] array) {
        Arrays.sort(array);
        return array;
    }

}
