package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();

        car.soundHorn();
        car.run();

        /*
        * 상속은 재사용이라는 장점만 바라보게 되면 오용의 가능성이 있기 때문에 유집수에 좋지않는 코드를 작성할 확률이 높다.
        * ==> 상속은 IS-A관계로 구분되는 경경에만 사용해야한다.
        *
        * 삼각형은 도형이다 (O)
        *
        *
        * */
        System.out.println("============ Fire Car ===========");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        fireCar.sprayWater();

        System.out.println("============ RacingCar ===========");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
    }
}
