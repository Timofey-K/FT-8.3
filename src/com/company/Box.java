/*
 *Данный пакет выполняет задание 8.3.
 *
 * версия 2.0 - 27.10.2019
 *
 * Автор Тимофей
 */
package com.company;

/**
 * Box - создаёт методы для работы с коробкой.
 *
 *@version  V 2.0  -  27.10.2019
 *@author  Timofey Kalinin
 * @param <T1> - объект любого типа
 */
public class Box<T1> {
    private T1 object1;

    Box(final T1 one) {
        object1 = one;
    }

    /**
     * @param object - объект который кладём в коробку
     */
    public void in(final T1 object) {             //положить в коробку
        object1 = object;
    }

    /**
     * @return - вернёт объект из коробки
     */
    public T1 out() {           //взять из коробки
        return object1;
    }

    /**
     * удалит объект из коробки.
     */
    public void del() {         //удалить из коробки
        object1 = null;
    }

    /**
     * проверит коробку на наличие объекта.
     */
    public void exist() {       //проверка объекта в коробке
        if (object1 == null) {
            System.out.println("Коробка пуста");
        } else {
            System.out.println("В коробке что то лежит");
        }
    }
}
