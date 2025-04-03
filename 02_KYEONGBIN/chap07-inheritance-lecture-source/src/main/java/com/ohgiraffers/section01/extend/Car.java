package com.ohgiraffers.section01.extend;

// 🚗 자동차(Car) 클래스 정의
public class Car {

    // 🚦 자동차의 주행 상태를 나타내는 변수 (true: 주행 중, false: 멈춤)
    private boolean runningStatus;

    // ✅ 기본 생성자 (객체가 생성될 때 자동으로 실행됨)
    public Car() {
        System.out.println("Car 클래스의 기본 생성자 호출됨...");
    }

    // 🚗 자동차가 달리도록 하는 메서드
    public void run() {
        runningStatus = true; // 주행 상태를 true로 변경
        System.out.println("자동차가 달립니다.");
    }

    // 📢 경적(클락션)을 울리는 메서드
    public void soundHorn() {

        // 자동차가 주행 중인지 확인
        if (isRunning()) {
            System.out.println("🖐️빵! 🖐️빵!"); // 주행 중이면 경적을 울릴 수 있음
        } else {
            System.out.println("주행중이 아닌 상태에는 경적을 울릴 수 없습니다."); // 정지 상태에서는 경적 불가능
        }
    }

    // ✅ 자동차가 주행 중인지 여부를 확인하는 메서드 (protected → 자식 클래스에서 접근 가능)
    protected boolean isRunning() {
        return runningStatus; // 주행 상태를 반환 (true 또는 false)
    }

    // ⛔ 자동차를 멈추는 메서드
    public void stop() {
        runningStatus = false; // 주행 상태를 false로 변경
        System.out.println("자동차가 멈춥니다.");
    }
}
