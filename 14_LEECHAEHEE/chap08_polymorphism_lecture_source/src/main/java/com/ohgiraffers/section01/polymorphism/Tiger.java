package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{
    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 왠만하면 안 달립니다. 어슬렁 어슬렁 거려요.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울부짖습니다. 어흐으으으응~");
    }

    public void bite() {
        System.out.println("호랑이가 물어뜯습니다. 앙~");
    }
}
