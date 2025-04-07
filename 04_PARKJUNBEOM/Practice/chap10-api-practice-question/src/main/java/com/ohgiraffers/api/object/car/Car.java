package com.ohgiraffers.api.object.car;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Car)) return false;

        Car car = (Car) obj;
        return carName.equals(car.carName) &&
                carColor.equals(car.carColor);
    }

    @Override
    public int hashCode() {
        int result = carName.hashCode();
        result = 31 * result + carColor.hashCode();
        return result;
    }
}


