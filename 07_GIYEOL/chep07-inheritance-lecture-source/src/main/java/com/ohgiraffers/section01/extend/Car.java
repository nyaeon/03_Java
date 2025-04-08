package com.ohgiraffers.section01.extend;

public class Car {
   private boolean runningstatus; //자동차의 상태값
    public Car() {
        System.out.println("car 클래스의 기본 생성자 호출");
    }
    public void run() {
        runningstatus = true;
        System.out.println("자동차가 달립니다.");
    }
    public void sound() {
        if (isrunning()) {
        System.out.println("빠ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅇ");
        }else {
            System.out.println("주행중이 아님");
        }
    }
    protected boolean isrunning() {
            return runningstatus;
    }
    public void stop() {
        runningstatus = false;
        System.out.println("차가 멈춤");
    }

}

