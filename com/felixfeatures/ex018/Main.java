package com.felixfeatures.ex018;

/**
 * 18. У вас есть доллары. Вы хотите обменять их на рубли.
 * Есть информация о стоимости купли-продажи в банках города.
 * В городе N банков. Составьте программу, определяющую, какой банк выбрать, чтобы выгодно обменять доллары на рубли.
 */
public class Main {

    public static void main(String[] args) {
        String[] banks = {"Bank 1", "Bank 2", "Bank 3", "Bank 4", "Bank 5"};
        double[] exchangeRates = {50.0, 50.2, 49.2, 49.9, 50.3};
        System.out.println(countBadQualityItems(banks, exchangeRates));
    }

    public static String countBadQualityItems(String[] banks, double[] exchangeRates) {
        int maxRateIndex = 0;
        for (int i = 0; i < banks.length; i++) {
            if (exchangeRates[i] > exchangeRates[maxRateIndex]) {
                maxRateIndex = i;
            }
        }
        return banks[maxRateIndex];
    }
}
