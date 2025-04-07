package com.ohgiraffers.section01.polymorphism;

public class Tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 뜁니다");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 웁니다");
    }

    public  void bite(){
        System.out.println("호랑이가 물었습니다.");
    }
}
