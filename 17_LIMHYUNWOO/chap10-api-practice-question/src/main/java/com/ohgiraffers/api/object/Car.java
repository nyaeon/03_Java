package com.ohgiraffers.api.object;

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
        boolean result = false;
        if (this.carName.equals(((Car) obj).carName)  && this.carColor.equals(((Car) obj).carColor)) {
            result = true;
        } else{
            result = false;
        }
        return result;
    }

    @Override
    public int hashCode() {
      return carName.hashCode() + carColor.hashCode();
    }

    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }
}
