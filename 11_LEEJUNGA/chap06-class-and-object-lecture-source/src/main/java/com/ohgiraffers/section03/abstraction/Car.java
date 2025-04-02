package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean isOn = false;
    private int speed;

    // 시동을 걸어라, 아픙로 가라, 멈춰라, 시동을 꺼라
    public void startUp() {
        if (this.isOn) { // isOn 값은 true
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다.");
        }
    }

    public void go () {
        if (isOn) { // 시동이 켜져 있어야 달리 수 있음
            this.speed += 10;
            System.out.println("차가 앞으로 움직입니다. 현재 속도는  " + speed);
        } else {
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop() {
        if (isOn) {
            if (speed > 0) {
                speed = 0;
                System.out.println("급브레이크를 밟음. 차를 멈춤");
            } else {
                System.out.println("차는 이미 멈춰있는 상태");
            }
        } else {
            System.out.println("차 시동 먼저 걸어주세여");
        }
    }

    public void turnOff() {
        if (isOn) {
            if (speed > 0) {
                System.out.println("달리는 중에선 시동을 끌 수 없음. 차 멈춰요.");
            } else {
                isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세여");
            }
        } else {
            System.out.println("이미 시동이 꺼져있는 상태입니다.");
        }
    }

}
