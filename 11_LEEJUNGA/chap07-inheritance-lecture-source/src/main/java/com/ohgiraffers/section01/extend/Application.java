package com.ohgiraffers.section01.extend;

public class Application {
    public static void main(String[] args) {
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*
        * 상속은 재사용이라는 장점만 바로보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지않은 코드를 작성할 확률이 높다.
        * ==> 상속은 IS-A 관계로 구분되는 경우에만 사용해야한다.
        *
        * 삼각형은 도형이다(O)
        * 도형은 삼각형이다(X)
        *
        * 소방차, 레이싱카 모두 자동차이다(O)
        * 자동차는 모두 소방차다(X)
        * */
        System.out.println("========== Fire Car ==========");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.sprayWater();

        // 객체 해시코드 확인
        System.out.println(car.hashCode());
        fireCar.superHashcode();
        System.out.println(fireCar.hashCode());

        System.out.println("******** Racing Car ********");
        RacingCar racingCar = new RacingCar();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
    }

}
