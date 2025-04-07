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
    public int hashCode() {
        int result = 1;
        final int PRIME = 31;
        result = PRIME * result + this.carName.hashCode();
        result = PRIME * result + this.carColor.hashCode();

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        Car other = (Car) obj;

        if (this.carName == null) {
            if (other.carName != null) {
                return false;
            }
        } else if (!this.carName.equals(other.carName)) {
            return false;
        }

        if (this.carColor == null) {
            if (other.carColor != null) {
                return false;
            }
        } else if (!this.carColor.equals(other.carColor)) {
            return false;
        }
        return true;
    }
}
