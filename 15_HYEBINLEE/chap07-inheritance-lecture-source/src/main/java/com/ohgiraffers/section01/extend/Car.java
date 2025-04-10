package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus; // 자동차의 달리는 상태값

    public Car() {
        System.out.println("Car 클래스의 기본생성자 호출됨...");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
    
    public void soundHorn() {
        
        if(isRunning()){
            System.out.println("🖐️빵! 🖐️빵!");
        } else {
            System.out.println("주행중이 아닌 상태에는 경적을 울릴 수 없습니다.");
        }
    }

    protected boolean isRunning() {
        return runningStatus;
    }

    public void stop() {

        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
}
