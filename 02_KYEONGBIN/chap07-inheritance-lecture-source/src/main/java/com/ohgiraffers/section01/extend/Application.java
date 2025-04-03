package com.ohgiraffers.section01.extend;

// 메인 클래스로 프로그램을 실행하는 역할
public class Application {

    public static void main(String[] args) {
        // 부모 클래스(Car)의 객체 생성
        Car car = new Car();

        // 자동차의 기능 실행
        car.soundHorn(); // 경적을 울림
        car.run();       // 자동차를 움직임
        car.soundHorn(); // 다시 경적을 울림
        car.stop();      // 자동차를 멈춤
        car.soundHorn(); // 멈춘 후 경적을 울림

        /*
         * ✅ 상속의 개념 설명
         * - 상속을 사용하면 코드 재사용이 가능하지만, 무조건 상속을 쓰면 유지보수가 어려워질 수 있음.
         * - 따라서, "IS-A 관계"인지 확인하고 상속을 사용해야 함.
         *
         * 예시:
         * ✅ 삼각형은 도형이다. (O) -> "Triangle is a Shape" (맞는 상속 관계)
         * ❌ 도형은 삼각형이다. (X) -> "Shape is a Triangle" (잘못된 상속 관계)
         *
         * ✅ 소방차와 레이싱카는 자동차이다. (O) -> "FireCar is a Car", "RacingCar is a Car" (맞는 상속 관계)
         * ❌ 모든 자동차는 소방차 혹은 레이싱카이다. (X) -> "Car is a FireCar" (잘못된 상속 관계)
         */

        // 🔥 FireCar (소방차) 객체 생성 및 기능 실행
        System.out.println("=========== FireCar ==========");
        FireCar fireCar = new FireCar();
        fireCar.soundHorn(); // 경적을 울림
        fireCar.run();       // 소방차를 움직임
        fireCar.soundHorn(); // 다시 경적을 울림
        fireCar.stop();      // 소방차를 멈춤
        fireCar.soundHorn(); // 멈춘 후 경적을 울림

        fireCar.sprayWater(); // 소방차가 물을 뿌리는 기능 실행

        // 🏎 RacingCar (레이싱카) 객체 생성 및 기능 실행
        System.out.println("=========== RacingCar ==========");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn(); // 경적을 울림
        racingCar.run();       // 레이싱카를 움직임
        racingCar.soundHorn(); // 다시 경적을 울림
        racingCar.stop();      // 레이싱카를 멈춤
        racingCar.soundHorn(); // 멈춘 후 경적을 울림
    }
}
