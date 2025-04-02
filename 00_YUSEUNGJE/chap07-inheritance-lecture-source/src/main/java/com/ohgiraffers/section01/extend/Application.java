package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {
        // 부모클래스
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*
        * 상속은 재사용이라는 장점만 바라보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지않는 코드를 작성할 확률이 높다.
        * ==> 상속은 IS-A관계로 구분되는 경우에만 사용해야한다.
        *
        * 삼각형은 도형이다(O)
        * 도형은 삼각형이다(X)
        *
        * 소방차, 레이싱카 모두 자동차이다.(O)
        * 모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카이다 (X)
        *
        * FireCar is a Car (o) / Car is a FireCar(x)
        * */

        System.out.println("=========== FireCar ==========");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        fireCar.sprayWater();

        System.out.println("=========== RacingCar ==========");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
    }
}
