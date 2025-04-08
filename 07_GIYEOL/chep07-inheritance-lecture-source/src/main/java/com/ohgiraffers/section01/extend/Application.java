package com.ohgiraffers.section01.extend;

public class Application {
public static void main(String[] args) {
    //부모 클래스
    Car car = new Car();
    car.sound();
    car.run();
    car.sound();
    car.stop();
    car.sound();
    /***
     * 상속은 재사용이라는 장점만 바라보게 되면 오용의 가능성이 있기 때문에 유지보수에 좋지않는 코드를 작성할 확률이 높다
     * => 상속은 IS-A 관계로 구분되느 경우에만 사용해야 한다
     * 삼각형은 도형이다(0)
     * 도형은 삼각형이다(x)
     *
     * 소방차,레이싱카 모두 자동차다(o)
     * 모든 자동차는 소방차,레이싱카 이다 (X)
     *
     * FireCar is car(o) / car is firecar(x)
     *
     */
    System.out.println("========Fire car=======");
    Firecar firecar = new Firecar();
    firecar.sound();
    firecar.run();
    firecar.sound();
    firecar.stop();
    firecar.sound();
    firecar.water();
    System.out.println("");
    System.out.println("=======Racing car=======");
    Racingcar racingcar = new Racingcar();
    racingcar.sound();
    racingcar.run();
    racingcar.sound();
    racingcar.stop();

}
}
