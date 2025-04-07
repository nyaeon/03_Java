package com.ohgiraffers.section04.user1;

public class Racingcar extends Car {


    @Override
    public void go() {
    System.out.println("레이싱 카가 달림");
    }

    @Override
    public void stop() {
        System.out.println("멈춤");
    }

    @Override
    public void horn() {

    }
}
