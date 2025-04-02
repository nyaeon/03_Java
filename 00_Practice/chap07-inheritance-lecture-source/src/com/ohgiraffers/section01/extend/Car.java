package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runnigStatus;

    public Car() {

        System.out.println("Car 클래스의 기본 생성자 호출됨...");
    }

    public void run() {
        runnigStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn() {

        if (isRunnig()){
            System.out.println("빵! 빵!");
        } else {
            System.out.println("주행중이 아닌 상태에는 경정을 울릴 수 없습니다.");
        }
    }

    protected boolean isRunnig() {
        return runnigStatus;
    }

    public void stop() {
        runnigStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
