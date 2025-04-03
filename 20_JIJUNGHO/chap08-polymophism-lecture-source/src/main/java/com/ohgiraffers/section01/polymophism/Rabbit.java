package com.ohgiraffers.section01.polymophism;

public class Rabbit extends Animal {

    // 오버라이딩 한 뒤 메소드 재정의
    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다. 냠냠냠");
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡총깡총🐇");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼익~~끼익~~");
    }

    public void jump() {
        System.out.println("토끼가 점프합니다. 쩜프!!!!");
    }
}
