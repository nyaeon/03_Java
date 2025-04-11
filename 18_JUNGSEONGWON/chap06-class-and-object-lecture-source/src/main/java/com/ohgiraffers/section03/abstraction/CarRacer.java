package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private final Car car = new Car(); // final이 붙어있으면 1번 입력하면 변경이 불가하다.

    public void startUp(){
        car.startup();
    }
    public void stepAccelator(){
        car.go();
    }
    public void stepBrake(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }
}

