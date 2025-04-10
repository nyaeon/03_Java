package com.ohgiraffers.api.object.car;

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
  public boolean equals(Object obj) {
    if (this.getCarName().equals(((Car) obj).getCarName()) && this.getCarColor()
        .equals(((Car) obj).getCarColor())) {
      return true;
    }
    return super.equals(obj);
  }

  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }

  public String getCarColor() {
    return carColor;
  }

  public void setCarColor(String carColor) {
    this.carColor = carColor;
  }

  public int getEngineCC() {
    return engineCC;
  }

  public void setEngineCC(int engineCC) {
    this.engineCC = engineCC;
  }
}
