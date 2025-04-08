package com.ohgiraffers.api.object;

import java.util.Objects;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;


    public Car() {
    }

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return engineCC == car.engineCC && Objects.equals(carName, car.carName) && Objects.equals(carColor, car.carColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carColor, engineCC);
    }


    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engineCC=" + engineCC +
                '}';
    }





}