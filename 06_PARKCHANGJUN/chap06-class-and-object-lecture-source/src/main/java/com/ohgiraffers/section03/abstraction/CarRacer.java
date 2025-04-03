package com.ohgiraffers.section03.abstraction;

public class CarRacer {

//    final int i = 0; // 상수만드는거
    private final Car car = new Car();

    public void startUp() {
        car.startUp();
    }

    public void stepAccelator() {
        car.go();
    }

    public void stopBreak() {
        car.stop();
    }

    public void turnOff() {
        car.turnOff();
    }
}
