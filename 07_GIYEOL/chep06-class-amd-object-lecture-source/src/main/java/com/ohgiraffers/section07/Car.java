package com.ohgiraffers.section07;

public class Car {
    private String modelname;
    private int maxspeed;
    public Car() {

    }

    public Car(String modelname, int maxspeed) {
        this.modelname = modelname;
        this.maxspeed = maxspeed;
    }
    public void drivemaxspeed() {
        System.out.println(modelname + " 차량이 최고 시속 " + maxspeed+"(km/h)로 달림");
    }

}
