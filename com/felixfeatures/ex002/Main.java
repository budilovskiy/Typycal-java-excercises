package com.felixfeatures.ex2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */
public class Main {

    public static int[] createIndexesArray(InputStreamReader in, int element) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int counter = 0;
        int number;
        while ((number = in.read()) != -1) {
            if (number == element) {
                buffer.write(counter);
            }
            counter++;
        }
        buffer.flush();

        byte[] byteArray = buffer.toByteArray();
        int[] result = new int[byteArray.length];
        for (int i = 0; i < byteArray.length; i++) {
            result[i] = (int) byteArray[i];
        }

        return result;
    }

    public static void main(String[] args) {
        byte[] array = {1, 0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 1, 0};
        InputStreamReader in = new InputStreamReader(new ByteArrayInputStream(array));
        try {
            System.out.println(Arrays.toString(createIndexesArray(in, 0)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
