package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {
        // 부모 클래스
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /*
        * 상속은 재사용이라는 장점만 바라보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지 않은 코드를 작성할 확률이 높다.
        * == 상속은 IS-A 관계로 구분되는 경우에만 사용해야 한다.
        *
        * 삼각형은 도형이다. (o)    -> 부모: 도형 / 자식: 삼각형
        * 도형은 삼각형이다. (x)
        *
        * 소방차, 레이싱카 모두 자동차이다. (o)   -> 부모: 자동차 / 소방차, 레이싱카: 자식
        * 모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카이다. (x)
        *
        * FireCar is a Car (o) ==> IS-A 관계
        * */

        System.out.println("========= Fire Car =========");
        FireCar fireCar = new FireCar();

        fireCar.soundHorn();
        fireCar.run();    // 이 메소드는 재정의하지 않았기 때문에 부모 클래스에서 작성된 대로 진행
        fireCar.soundHorn();
        fireCar.sprayWater();    // 이렇게 자식 클래스가 따로 메소드를 작성해도 OK
        fireCar.stop();   // 이 메소드는 재정의하지 않았기 때문에 부모 클래스에서 작성된 대로 진행

        System.out.println("========= Racing Car =========");
        RacingCar racingCar = new RacingCar();

        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
    }
}
