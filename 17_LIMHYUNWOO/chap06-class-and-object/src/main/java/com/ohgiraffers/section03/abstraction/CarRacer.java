package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private   final Car car = new Car();
    public void Startup(){
        car.startUp();
    }

    public void stepAccelator(){
        car.go();
    }
    public void stepBreaker(){
        car.stop();
    }
    public void turnOff(){
        car.turnOff();
    }

}
