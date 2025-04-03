package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {
    public RacingCar() {
        System.out.println("RacingCar 클래스의 기본생성자 호출됨...");
    }

    @Override
    public void run() {
        System.out.println("레이싱카 전속력 질주 --");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적 울리지 않음 ..");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다 ~~");
    }
}
