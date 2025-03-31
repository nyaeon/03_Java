package com.ohgiraffers.section01.method;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("main 시작함");
        methodA();
        // Application1.methodA(); -- 이렇게도 사용할 수 있음
        methodB();
        System.out.println("main 종료됨");

    }

    public static void methodA() {
        // 메소드는 호출한 곳으로 돌아감
        // main에서 methodA을 호출했다면, methodA가 실행된 후
        // main으로 돌아가서 위에서 아래로 순차적으로 코드를 실행함
        System.out.println("methodA 호출됨");
        System.out.println("methodA 종료됨");
    }
    // summary (요약)
    /***
     * methodB() 입니다.
     */
    public static void methodB() {
        System.out.println("methodB 호출됨");
        System.out.println("methodB 종료됨");
    }
}
