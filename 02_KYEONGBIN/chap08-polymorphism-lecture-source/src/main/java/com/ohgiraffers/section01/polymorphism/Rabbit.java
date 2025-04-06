package com.ohgiraffers.section01.polymorphism;

public class Rabbit extends Animal { // 토끼는 동물이다 // Animal에 대한 모든걸 가져다 쓸 수 있음


    @Override
    public void eat() {
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다."); // 오버라이딩 후 super 지우기
    }

    @Override
    public void run() {
        System.out.println("토끼가 달려갑니다. 깡충~~ 깡충~~");

    }

    @Override
    public void cry() {
        System.out.println("토끼가 울음소리를 냅니다. 끼익~ 끼익~");
    }


    public void jump() {
        System.out.println("토끼가 점프합니다. 점프!!!");
    }
}
