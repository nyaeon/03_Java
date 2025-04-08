package com.ohgiraffers.section07;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Car car1 = new Car("페라리",300);
        Car car2 = new Car("람보르기니",510);
        Car car3 = new Car("롤스로이스",250);
        Car car4 = new Car("부가티",400);
        Car car5 = new Car("포터",500);

        car1.drivemaxspeed();
        car2.drivemaxspeed();
        car3.drivemaxspeed();
        car4.drivemaxspeed();
        car5.drivemaxspeed();

        Car[] carArr = new Car[5];
        System.out.println(Arrays.toString(carArr));
        carArr[0] = new Car("페라리",300);
        carArr[1] = new Car("람보르기니",510);
        carArr[2] = new Car("롤스로이스",250);
        carArr[3] = new Car("부가티",400);
        carArr[4] = new Car("포터",500);
        System.out.println(Arrays.toString(carArr));
        //향상된 for문
        carArr[0].drivemaxspeed();
    }
}
