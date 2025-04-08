package com.ohgiraffers.section03.abstraction;

//public class CarRacer {

//p   private  final Car car = new Car();

//p   public void startUp() {
//p       car.startUp();
//p   }
//p   public void stepAccrelator(){
//p       car.go();
//p   }
//p   public void stepBreak() {
//p       car.stop();
//p   }
//p   public void turnoff(){
//p       car.trunoff();
public class CarRacer {

    private  final Car car = new Car();

    public void startUp() {
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

