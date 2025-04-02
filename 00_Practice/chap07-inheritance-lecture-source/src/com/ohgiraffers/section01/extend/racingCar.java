package com.ohgiraffers.section01.extend;

public class racingCar extends Car {

    @Override
    public void run() {
        System.out.println("레이싱카가 달립니다!!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지 않습니다 ----조용-----");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }

    public racingCar() {
        // super();  // ❌ 부모 클래스(Car)의 생성자 호출을 명시적으로 막음
        System.out.println("Racing Car 클래스 ");
    }
}
