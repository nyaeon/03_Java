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
         * 상속은 재사용이라는 장점만 바로보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지않는
         * 코드를 작성할 확률이 높다.
         * => 상속은 IS-A관계로 구분되는 경우에만 사용해야한다.
         *
         * ex) IS-A : 같은 분류(카테고리) 및 연결성이 있을때 상속을 사용할 수 있다.
         * 삼각형은 도형이다.(O)
         * 모든 도형은 삼각형이다.(X)
         *
         * 소방차, 레이싱카 모두 자동차이다.(O)
         * 모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카이다.(X)
         */

        System.out.println("========== Fire Car ==========");

        FIreCar fireCar = new FIreCar();
        fireCar.soundHorn(); // 자식(FireCar) 메소드
        fireCar.run(); // 부모(Car) 메소드
        fireCar.soundHorn(); // 오버라이딩 한 자식(FireCar) 메소드
        fireCar.sprayWater(); // 새로 만든 자식(FireCar) 메소드
        fireCar.stop(); // 부모(Car) 메소드

        System.out.println("========== Racing Car ==========");

        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();

    }
}
