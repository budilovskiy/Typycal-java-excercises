package com.felixfeatures.ex026;

/**
 * 26. В последовательности действительных чисел а1, а2, ..., аn есть только положительные и отрицательные элементы.
 * Вычислить произведение отрицательных элементов P1 и произведение положительных элементов Р2.
 * Сравнить модуль Р2 с модулем Р1 и указать, какое из произведений по модулю больше.
 */
public class Main {

    public static void main(String[] args) {
        int[] array = {10, 13, 1, -31, 12, -5, -47, 18, 40, -30, -1, -10};
        calculateProducts(array);
    }

    public static void calculateProducts(int[] array) {
        long positiveProduct = 1;
        long negativeProduct = 1;

        for (int element : array) {
            if (element > 0) {
                positiveProduct *= element;
            } else if (element < 0) {
                negativeProduct *= element;
            }
        }

        if (Math.abs(negativeProduct) < positiveProduct) {
            System.out.println("Product of negative numbers " + negativeProduct +
                    " is less than product of positive numbers " + positiveProduct);
        } else if (Math.abs(negativeProduct) > positiveProduct) {
            System.out.println("Product of negative numbers " + negativeProduct +
                    " is greater than product of positive numbers " + positiveProduct);
        } else {
            System.out.println("Product of negative numbers " + negativeProduct +
                    " equals product of positive numbers " + positiveProduct);
        }
    }

}
