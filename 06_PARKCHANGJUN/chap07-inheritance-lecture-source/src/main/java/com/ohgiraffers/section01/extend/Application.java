package com.ohgiraffers.section01.extend;

public class Application {

    // 상속이 들어오면 장점
    // 재사용성이 높아진다.
    // 수정사항이 있으면 부모클래스만 하면 된다. 자식클래스에서도 자동으로 수정됨
    public static void main(String[] args) {

        // 부모클래스
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /**
         * 상속은 재사용이라는 장점만 바라보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지않는 코드를 작성할 확률이 높다.
         * ==> 상속은 IS-A 관계로 구분되는 경우에만 사용해야한다.
         *
         * 삼각형은 도형이다(o)
         * 도형은 삼각형이다(X)
         *
         * 소방차, 레이싱카 모두 자동차이다.(O)
         * 모든 자동차는 소방차 혹은 스쿨버스 혹은 레이싱카이다.(X)
         *
         * FireCar is a Car(O) / Car is a FireCar(X)
         **/

        System.out.println();
        System.out.println("============= Fire Car ==============");
        FireCar fireCar = new FireCar(); // Fire Car 부모생성자와 함께 출력됨
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        fireCar.sprayWater();

        // 자식클래스는 항상 부모클래스를 참조
        // 상속이 모두 편안하게 만들어주는 것은 아니다.
        // 자식클래스가 상속을 받게 되면 부모클래스의 내용을 다 받게 되닌까 부모 클래스의 내용을 수정해야 하는 일이 발생한다.
        System.out.println();
        System.out.println("============= Racing Car ==============");
        RacingCar racingCar = new RacingCar();
        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();
    }

}
