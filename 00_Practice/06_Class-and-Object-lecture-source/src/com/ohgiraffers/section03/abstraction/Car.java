package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn = false; // 

    private int speed;

    public void startup() {
        if(this.isOn) {
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 부릉부릉~~ ");
        }
    }
    
    public void go() {
        if(isOn){ // 시동이 켜져 있어야 달릴 수 있음
            this.speed += 10;
            System.out.println("차가 앞으로 움직입니다." +
                    "현재 속도는 " +
                    speed);
            
        } else {
            System.out.println("차 시동의 걸려있지 않습네다. 시동을 먼저 걸으라우!");
        }
    }
    
    public void stop() {
        if(isOn){
            if (speed > 0) {
                speed = 0;
                System.out.println("급 브레이크를 밟았습네다. 차를 멈춤네다.");
            } else {
                System.out.println("차는 이미 멈춰있는 상태입네다");
            }
            
        } else {
            System.out.println("차의 시동이 걸려있지 않습네다");
        }
    }
    
    public void shutdown() {
        if(isOn){
            if (speed > 0) {
                System.out.println("달리는 상태에서 시동을 끌 수 없습네다. 차를 먼저 세우라우");
            } else {
                isOn = false;
                System.out.println("시동을 끕네다. 다시 운행하려면 시통을 키시라우");
            }
        } else {
            System.out.println("이미 시동이 꺼져있는 상태입니다. 시동 상태를 확인해주세요");            
        }
    }
}
