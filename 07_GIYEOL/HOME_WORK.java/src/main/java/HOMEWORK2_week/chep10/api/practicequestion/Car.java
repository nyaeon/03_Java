package HOMEWORK2_week.chep10.api.practicequestion;

public class Car {
    private String carName;
    private String carColor;
    private int engineCC;

    public Car(java.lang.String sonata, java.lang.String 검정, int engineCC) {
    }

    public String getCarName() {
        return carName;
    }

    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public void setEngineCC(int engineCC) {
        this.engineCC = engineCC;
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

    @Override
    public java.lang.String toString() {
        return "Car{" +
                "carName=" + carName +
                ", carColor=" + carColor +
                ", engineCC=" + engineCC +
                '}';
    }
    
}