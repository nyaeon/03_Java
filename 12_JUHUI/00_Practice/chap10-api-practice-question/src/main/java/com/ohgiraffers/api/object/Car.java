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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 객체가 같은지 확인. 같지않으면 false 출력
        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        // 과제의 예시 결과를 보니 carName과 carColor만 비교하는 것 같습니다
        return carName.equals(car.carName) && carColor.equals(car.carColor);
    }

    @Override
    public int hashCode() {
        int result = carName.hashCode();
        result = 31 * result + carColor.hashCode();
        return result;
    }
}
