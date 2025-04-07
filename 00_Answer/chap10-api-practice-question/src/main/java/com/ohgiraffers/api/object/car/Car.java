package com.ohgiraffers.api.object.car;

public class Car {

    private String carName;
    private String carColor;
    private int engineCC;

    public Car() {}

    public Car(String carName, String carColor, int engineCC) {
        super();
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    //복사생성자
    public Car(Car other){
        this.carName = other.carName;
        this.carColor = other.carColor;
        this.engineCC= other.engineCC;
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

    @Override
    public String toString() {
        return "Car [carName=" + carName + ", carColor=" + carColor + ", engineCC=" + engineCC + "]";
    }


    @Override
    public boolean equals(Object obj) {
        // 두객체간 참조주소값이 같으면 같은 객체이다
        if (this == obj)
            return true;

        if (obj == null)
            return false;

        // 같은 클래스타입이 아니면, false;
        if (getClass() != obj.getClass())
            return false;

        // Car 객체이므로, 각필드별 비교시작
        Car other = (Car) obj;
        // 1. carName필드
        if (carName == null) {
            if (other.carName != null)
                return false;
        } else if (!carName.equals(other.carName))
            return false;

        // 2. carColor필드
        if (carColor == null) {
            if (other.carColor != null)
                return false;
        } else if (!carColor.equals(other.carColor))
            return false;

        //여기까지 도달하면 true리턴
        return true;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((carColor == null) ? 0 : carColor.hashCode());
        result = prime * result + ((carName == null) ? 0 : carName.hashCode());
        return result;
    }
}
