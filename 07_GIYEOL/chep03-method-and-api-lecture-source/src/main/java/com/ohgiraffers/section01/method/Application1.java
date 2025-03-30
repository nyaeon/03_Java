package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
    System.out.println("main() 시작");
    methodA();
    System.out.println("maun() 종료됨");
    }

    public static void methodA() {
        System.out.println("methodA() 호출");
        methodB();
        System.out.println("methodA() 종료됨");
    // return ; 생략됨 수행후 main으로 반환

    }
    // 단축키 메소드에서 컨트로+B => 이동
    /***
     * 메소드B() 입니다.
     */
    public static void methodB() {
        System.out.println("methoB() 호출됨");
        System.out.println("methoB() 종료됨");
    }
}
