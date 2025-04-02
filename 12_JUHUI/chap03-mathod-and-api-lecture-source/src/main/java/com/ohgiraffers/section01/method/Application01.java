package com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) {
        System.out.println("main() 시작함");
        Application01.methodA();
        Application01.methodB();
        System.out.println("main() 종료됨");
    }
    public static void methodA() {
        System.out.println("methodA 호출됨");
        System.out.println("methodA 종료됨");
    }
    /***
     * methodB() 입니다.
     */
    public static void methodB() {
        System.out.println("methodB 호출됨");
        System.out.println("methodB 종료됨");
    }
}
