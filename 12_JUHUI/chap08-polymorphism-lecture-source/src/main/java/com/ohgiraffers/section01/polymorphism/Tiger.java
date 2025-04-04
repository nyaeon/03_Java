package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 웬만해서는 달리지 않습니다. 어슬렁 ~ 어슬렁 ~ 어슬렁 걸어갑니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흐흐흫흥~!!");
    }

    public void bite() {
        System.out.println("호랑이가 물어뜯습니다. 앙~~");
    }
}
