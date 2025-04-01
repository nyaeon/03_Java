package com.ohgiraffers.section03.abstraction;

public class CarRacer {

<<<<<<< HEAD
    public final void carRacer() {}

    public void carRacer(int speed) {}



=======
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
>>>>>>> bf881c180d9ef401bbe2774197ac8c12a22f50eb
}
