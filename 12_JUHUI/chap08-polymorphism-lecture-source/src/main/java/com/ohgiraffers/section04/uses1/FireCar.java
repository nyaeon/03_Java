package com.ohgiraffers.section04.uses1;

public class FireCar extends Car implements Soundable {
    @Override
    public void go() {
        System.out.println("소방차가 달립니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다.");
    }

    @Override
    public void horn() {
        System.out.println("소방차가 나갑니다. 다들 비키세요~~ 따르르르릉");
    }
}
