package com.ohgiraffers.section01.method;

public class Application1 {

    public static void main(String[] args) {
        System.out.println("main() 시작함");
        Application1.methodA();
        methodA();
        System.out.println("main() 종료됨");

    }
    public static void methodA(){
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
    }

    /***
     * methondB() 입니다.
     * @param args
     */
    public static void methodB(String[] args) {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }
}

