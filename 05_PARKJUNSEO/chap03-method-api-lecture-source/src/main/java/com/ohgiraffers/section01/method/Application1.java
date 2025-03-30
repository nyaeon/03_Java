package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {
        // public : 어디서나 접근 가능

        System.out.println("main() 시작함");
        methodA();
        System.out.println("main() 종료됨");
    }

    public static void methodA() {
        System.out.println("methodA() 호출됨");
        methodB();
        System.out.println("methodA() 종료됨");
    }

    /***
     * methodB() 입니다. // 이렇게 summary를 붙인 후 메소드 위에 마우스를 올리면 정보가 나옴
     */

    public static void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");

    }
}

// 프로그래밍이 실행할 때


