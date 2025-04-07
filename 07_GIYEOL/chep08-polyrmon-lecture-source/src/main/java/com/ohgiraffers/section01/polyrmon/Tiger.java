package com.ohgiraffers.section01.polyrmon;

public class Tiger extends Animal {
    @Override
    public void run() {
        System.out.println("호랑이가 달리지 않음");
    }

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 먹음");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 운다");
    }
    public void bite(){
        System.out.println("호랑이가 물어 뜯는다");
    }
}
