package com.ohgiraffers.section03.abstraction;

public class Car {
    private boolean ison = false; //시작은 시동이 꺼져있는 상태
    private int speed; //속도

    //시동을 걸어라, 앞으로 가라, 멈춰라 ,시동을 꺼라
    public void startup() {
        if (this.ison) { //ison의 값은 ? true
            System.out.println("이미 시동 걸림");

        } else {
            this.ison = true;
            System.out.println("시동을 걸었습니다");
        }
    }

    public void go() {
        if (ison) { //시동이 켜져 었어야 전진 가능
            this.speed += 10;
            System.out.println("차가 앞으로 움직입니다. 현재 속도는" + speed);
        } else {
            System.out.println("차에 시동이 꺼져 있음,시동부터 켜 주세요");
        }
    }

    public void stop() {
        if (ison) {
            if (speed > 0) {
                speed = 0;
                System.out.println("차를 멈춘다");
            } else {
                System.out.println("차는 이미 정지해 있습니다");
            }}else{
                System.out.println("차에 시동이 꺼져 있습니다.");
            }

    }

    public void trunoff() {
        if (ison) {
            if(speed > 0){
                System.out.println("달리는 중에 시동을 끌 수 없다");
            }else {
                ison = false;
                        System.out.println("시동을 끕니다 다시 켜 주세요");
            }
        }else {
            System.out.println("시동이 꺼져 있습니다");
        }
    }
}
