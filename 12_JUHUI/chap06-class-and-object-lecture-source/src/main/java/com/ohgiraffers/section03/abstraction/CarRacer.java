package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    // final int = 1; // 상수 만드는 것임.
    private final Car car = new Car();

    public void startUp() {
        car.starUp();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stepBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }
}
