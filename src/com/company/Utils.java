package com.company;

public class Utils {

    public void create(Box K1, Object O1){                  //положить в коробку объект
        K1.in(O1);
    }

    public void random (Object O1, Object O2, Object O3){   //вернуть любой из 3 объектов
        final int max = 3;
        final int rnd1 = rnd(max);

        switch (rnd1){
            case 0:
                System.out.println(O1);
                break;
            case 1:
                System.out.println(O2);
                break;
            case 2:
                System.out.println(O3);
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static int rnd (int max){
        return (int) (Math.random() *max);
    }

}
