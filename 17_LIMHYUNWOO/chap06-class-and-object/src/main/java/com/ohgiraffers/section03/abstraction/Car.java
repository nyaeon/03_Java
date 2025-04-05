package com.ohgiraffers.section03.abstraction;

public class Car {
    /*1. 시동을 걸어라
       2. 앞으로 가라
       3. 멈춰라
       4. 시동을 꺼라*/
    private boolean isOn = false; //시작은 시동이 꺼져있는 상태
    private int speed; // 속도

    public void startUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 🚗");
        }
    }

    public void go() {
        if (isOn) {
            this.speed += 10;
            System.out.println("차가 앞으로 움직입니다. 현재 속도는 :" + speed + " km/h입니다");
        } else {
            System.out.println("차에 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }
    }

    public void stop() {
        if (isOn) {
            if (speed > 0) {
                this.speed = 0;
                System.out.println("급 브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰 있는 상태입니다.");
            }
        } else {
            System.out.println("차에 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요");
        }
    }

    public void turnOff(){
        if (isOn) {
            if( speed > 0){
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈춰주세요. ");
            } else {
                isOn = false;
                System.out.println("시동을 끕니다 . 다시 운행하려면 시동을 켜 주세요");
            }
        } else{
            System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동 상태를 확인해 주세요. ");
        }
    }
}
