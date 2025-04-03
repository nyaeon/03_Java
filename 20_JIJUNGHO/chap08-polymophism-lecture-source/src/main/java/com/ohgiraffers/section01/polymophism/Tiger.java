package com.ohgiraffers.section01.polymophism;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("호랑이가 고기를 뜯어 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이는 왠만해서는 달리지 안습니다. 어슬렁~ 어슬렁~ 걸어다닙니다.🐅");
    }

    @Override
    public void cry() {
        System.out.println("호랑이가 울음소리를 냅니다. 어흐흐흐으으응~~!🐯");
    }

    public void bite () {
        System.out.println("호랑이가 물어뜯습니다. 앙~~🦷");
    }

}
