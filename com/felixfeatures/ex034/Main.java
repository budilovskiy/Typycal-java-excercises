package com.felixfeatures.ex034;

/**
 * 34. Каждый солнечный день улитка, сидящая на дереве, поднимается вверх на 2 см, а каждый пасмурный день
 * опускается вниз на 1 см, В начале наблюдения улитка находится в A см от земли на B-метровом дереве.
 * Имеется 30-элементный массив, содержащий сведения о том, был ли соответствующий день наблюдения пасмурным или солнечным.
 * Написать программу, определяющую местоположение улитки к концу 30-го дня наблюдения.
 */
public class Main {

    public static void main(String[] args) {
        boolean[] sunnyDays = {
                false, false, false, true, false, false, true, true, true, true,
                false, false, false, true, false, false, true, true, true, true,
                false, false, false, true, false, false, true, true, true, true
        };
        System.out.println(snailTracking(new Snail(2, -1), sunnyDays, 190, 2));
    }

    public static int snailTracking(Snail snail, boolean[] array, int startPoint, int treeHeight) {
        int result = startPoint;
        for (boolean sunnyDay : array) {
            if (sunnyDay) {
                result += snail.getSunnyDaySpeed();
                if (result > treeHeight * 100) {
                    result = treeHeight * 100;
                }
            } else {
                result += snail.getCloudyDaySpeed();
                if (result < 0) {
                    result = 0;
                }
            }
        }
        return result;
    }
}
