package com.company;

public class Main {

    public static void main(String[] args) {
            //Часть 1 - проверка
        Box<Integer> K1 = new Box<>(5);
        K1.exist();
        System.out.println(K1.out());
        K1.in(110);
        K1.exist();
        System.out.println(K1.out());
        K1.del();
        K1.exist();

            //Часть 2 - проверка
        Utils U1 = new Utils();
        U1.create(K1, "Start");
        System.out.println(K1.out());
        U1.random(3,"Finish",0);

    }
}

class Box<T1> {
    T1 object1;

    Box(T1 one) {
        object1 = one;
    }

    public void in(T1 object) {             //положить в коробку
        object1 = object;
    }

    public T1 out(){                        //взять из коробки
        return object1;
    }

    public void del(){                      //удалить из коробки
        object1 = null;
    }

    public void exist(){                    //проверка наличия/отсутствия объекта в коробке
        if (object1 == null){
            System.out.println("Коробка пуста");
        } else{
            System.out.println("В коробке что то лежит");
        }
    }

}