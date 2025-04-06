package com.ohgiraffers.api.object;

public class Car {

    private String carName;
    private String carColor;
    private int engineCC;

    public Car() {}

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    // getter(전달)
    public String getCarName() {
        return carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public int getEngineCC() {
        return engineCC;
    }

    //setter(값 저장)
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
    }
}
