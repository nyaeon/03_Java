package com.ohgiraffers.section03.abstraction;

public class CarRacer {
    
    private final Car car = new Car();

    public static void stop() {
    }

    public void startUp() {
        car.startUp();
    }
    public void stepAccelator() {
        car.go();
    }

    public void stepBreak() {

    }
    public void turnOff() {
        car.turnOff();
    }
}
