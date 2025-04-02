package com.ohgiraffers.section03.abstraction;

//public class Car {
    //    private boolean ison = false; //시작은 시동이 꺼져있는 상태
    //    private int speed; //속도
    //
            //    //시동을 걸어라, 앞으로 가라, 멈춰라 ,시동을 꺼라
            //    public void startup() {
        //        if (this.ison) { //ison의 값은 ? true
            //            System.out.println("이미 시동 걸림");
            //
            //        } else {
            //            this.ison = true;
            //            System.out.println("시동을 걸었습니다");
            //        }
        //    }
    //
            //    public void go() {
        //        if (ison) { //시동이 켜져 었어야 전진 가능
            //            this.speed += 10;
            //            System.out.println("차가 앞으로 움직입니다. 현재 속도는" + speed);
            //        } else {
            //            System.out.println("차에 시동이 꺼져 있음,시동부터 켜 주세요");
            //        }
        //    }
    //
            //    public void stop() {
        //        if (ison) {
            //            if (speed > 0) {
                //                speed = 0;
                //                System.out.println("차를 멈춘다");
                //            } else {
                //                System.out.println("차는 이미 정지해 있습니다");
                //            }}else{
            //                System.out.println("차에 시동이 꺼져 있습니다.");
            //            }
        //
        //    }
    //
            //    public void trunoff() {
        //        if (ison) {
            //            if(speed > 0){
                //                System.out.println("달리는 중에 시동을 끌 수 없다");
                //            }else {
                //                ison = false;
                //                        System.out.println("시동을 끕니다 다시 켜 주세요");
                //            }
            //        }else {
            //            System.out.println("시동이 꺼져 있습니다");
            //        }
        //    }
public class Car {

    private boolean isOn = false; // 시작은 시동이 꺼져있는 상태
    private int speed;            // 속도

    //  시동을걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라

    public void startUp(){

        if(this.isOn) { // isOn 값은 ? true
            System.out.println("이미 시동이 걸려 있습니다.");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 부릉부릉~🤖🤖");
        }
    }

    public void go() {
        if(isOn) { // 시동이 켜져 있어야 달릴 수 있음
            this.speed += 10;
            System.out.println("차가 앞으로 움직입니다. 현재 속도는 " + speed);
        } else {
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop(){

        if(isOn) {
            if(speed > 0) {
                speed = 0;
                System.out.println("급 브레이크를 밟았습니다. 차를 멈춥니다.");
            } else {
                System.out.println("차는 이미 멈춰 있는 상태입니다.");
            }
        } else {
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void turnOff() {
        if(isOn) {
            if(speed > 0) {
                System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈춰주세요.");
            } else {
                isOn = false;
                System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜 주세요!");
            }
        } else {
            System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동 상태를 확인해 주세요.");
        }
    }
}

