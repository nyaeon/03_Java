package com.ohgiraffers.section01.polymorphism;


//토끼는 동물이다. IS-A
public class Rabbit extends Animal {
    @Override
    //animal이 가지고 있는 메소드를 자기 입맛대로 바꾼 것.
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡총~ 깡총~");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼익~끼익 ");
    }

    public void jump() {
        System.out.println("토끼가 점프합니다. 쩜푸!");
    }
}
