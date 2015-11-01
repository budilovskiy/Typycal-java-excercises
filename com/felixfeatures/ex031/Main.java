package com.felixfeatures.ex031;

/**
 * 31. У прилавка магазина выстроилась очередь из n покупателей.
 * Время обслуживания i-того покупателя равно tj (i = 1, …, n).
 * Определить время Ci пребывания i-гo покупателя в очереди.
 */
public class Main {

    public static void main(String[] args) {
        int time = 300;
        System.out.println(serviceTime(10, time));
    }

    public static int serviceTime(int queueNumber, int time) {
        return time * queueNumber;
    }

}
