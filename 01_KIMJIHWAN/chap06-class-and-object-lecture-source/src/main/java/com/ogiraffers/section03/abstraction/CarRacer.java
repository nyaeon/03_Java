package com.ogiraffers.section03.abstraction;

public class CarRacer {
    //    final int i = 0;
    private final Car car = new Car();

    public void starUp () {
        car.startUp();
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
