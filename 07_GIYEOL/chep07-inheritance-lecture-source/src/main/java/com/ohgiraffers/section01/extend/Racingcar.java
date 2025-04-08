package com.ohgiraffers.section01.extend;

public class Racingcar extends Car {
    public Racingcar() {
    System.out.println("레이싱카 기본생성자 호출");

    }

    @Override
    public void run() {
      System.out.println("레이싱카가 달린다!");
    }

    @Override
    public void sound() {
       System.out.println("경적이 없다");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춤");
    }

}
