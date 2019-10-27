/*
 *Данный пакет выполняет задание 8.3.
 *
 * версия 2.0 - 27.10.2019
 *
 * Автор Тимофей
 */
package com.company;
import java.util.Random;

/**
 * Utils - предоставляет различные методы.
 *
 *@version  V 2.0  -  27.10.2019
 *@author  Timofey Kalinin
 */
public class Utils {

    /**
     * выполняет метод - Положить объект в коробку.
     * @param k1 - выбирает коробку.
     * @param o1 - выбирает объект.
     */
    public void create(final Box k1, final Object o1) {
        k1.in(o1);
    }

    /**
     * Выполняет метод - возврат рандомного объекта.
     * @param o1 - первый объект.
     * @param o2 - второй объект.
     * @param o3 - третий объект.
     */
    public void random(final Object o1, final Object o2, final Object o3) {
        final int max = 3;
        Random rnd = new Random();
        final int rnd1 = rnd.nextInt(max);

        switch (rnd1) {
            case 0:
                System.out.println(o1);
                break;
            case 1:
                System.out.println(o2);
                break;
            case 2:
                System.out.println(o3);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
