/*
 *Данный пакет выполняет задание 8.3.
 *
 * версия 2.0 - 27.10.2019
 *
 * Автор Тимофей
 */
package com.company;

/**
 * Main - выполняет программу по заданию 8.3.
 *
 *@version  V 2.0  -  27.10.2019
 *@author  Timofey Kalinin
 */
public class Main {

    public static void main(final String[] args) {
        final int const1 = 5;
        final int const2 = 110;
        final int testO1 = 3;
            //Часть 1 - проверка
        Box<Integer> k1 = new Box<>(const1);
        k1.exist();
        System.out.println(k1.out());
        k1.in(const2);
        k1.exist();
        System.out.println(k1.out());
        k1.del();
        k1.exist();

            //Часть 2 - проверка
        Utils u1 = new Utils();
        u1.create(k1, "Start");
        System.out.println(k1.out());
        u1.random(testO1, "Finish", 0);
    }
}



