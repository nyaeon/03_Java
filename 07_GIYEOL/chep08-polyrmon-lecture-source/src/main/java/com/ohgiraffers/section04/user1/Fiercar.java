package com.ohgiraffers.section04.user1;

public class Fiercar extends Car implements Soundable {
    @Override
    public void go() {
        System.out.println("어젯밤 이야기");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춤");
    }

    @Override
    public void horn() {
        System.out.println("따르릉 따르릉 비켜나세염");
    }
}
