package com.felixfeatures.ex017;

import java.math.BigDecimal;

/**
 * 17. Пригодность детали оценивается по размеру B, который должен соответствовать интервалу (A – δ, A + δ).
 * Определить, имеются ли в партии из N деталей бракованные.
 * Если да, то подсчитать их количество, иначе выдать отрицательный ответ.
 */
public class Main {

    public static void main(String[] args) {
        double[] sizes = {10.003, 10.0, 10.006, 10.001, 9.990, 9.997};
        System.out.println("Number of bad-quality items: " + countBadQualityItems(sizes, 10.0, 0.005));
    }

    public static int countBadQualityItems(double[] sizes, double standartSize, double delta) {
        int counter = 0;
        for (double size : sizes) {
            counter += (Math.abs(BigDecimal.valueOf(standartSize).add(BigDecimal.valueOf(size).negate()).doubleValue()) <= delta) ? 0 : 1;
        }
        return counter == 0 ? -1 : counter;
    }
}
