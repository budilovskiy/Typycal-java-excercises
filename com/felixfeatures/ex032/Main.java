package com.felixfeatures.ex032;

import java.util.Arrays;
import java.util.Random;

/**
 * 32. Секретный замок для сейфа состоит из 10 расположенных в ряд ячеек, в которые надо вставить игральные кубики.
 * Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на передних гранях кубиков равна 10.
 * (Игральный кубик имеет на каждой грани от 1 до 6 точек.)
 * Напишите программу, которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {1, 0, 0, 0, 0, 0, 4, 0, 0, 0};
        unlock(array);
        System.out.println(Arrays.toString(array));
    }

    public static void unlock(int[] array) {
        int[] sequence = {6, 3, 1}; //sum = 10;

        for (int i = 0; i <= array.length - sequence.length; i++) {
            // find sequence of 3 empty cells
            int counter = 0;
            for (int j = 0; j < sequence.length; j++) {
                if (array[i + j] == 0) {
                    counter++;
                }
            }
            // if empty sequence was found, fill it with sequence with sum = 10
            if (counter == 3) {
                for (int j = 0; j < sequence.length; j++) {
                    array[i + j] = sequence[j];
                }
                break;
            }
        }

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = random.nextInt(6) + 1;
            }
        }
    }

}
