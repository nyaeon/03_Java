package com.ohgiraffers.section01.polyrmon;

public class Rabbit extends Animal {
    
    @Override
    public void eat() {
        System.out.println("토키가 풀을 먹음");
    }

    @Override
    public void run() {
        System.out.println("토키가 달림");
    }

    @Override
    public void cry() {
        System.out.println("토키가 운다");
    }
    public void jump(){
        System.out.println("토키가 점프한다");
    }
}
