package com.ohgiraffers.section01.extend;

public class Car {

    // 자동차의 달리는 상태값
    private boolean runningStatus;

    public Car() {
        System.out.println("Car 클래스의 기본생성자 호출됨...");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void soundHorn() {
        if (isRunning()) {
            System.out.println("🚗빵! 빵!");
        } else {
            System.out.println("주행중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }

    // 현재 자동차의 상태값을 나타내는 메소드
    // public 어디서든 접근 가능 (다른 패키지도 O)
    // protected 같은 패키지 + 다른 패키지에 있는 상속받은(자식) 클래스에서 접근 가능
    // default (아무것도 안 적었을 때)	같은 패키지 내에서만 접근 가능
    // private	해당 클래스 내부에서만 접근 가능
    protected boolean isRunning() {
        return runningStatus;
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

}
