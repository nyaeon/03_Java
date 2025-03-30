package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main 시작");

        // 객체를 생성
        Application2 app = new Application2();
        app.methodA();
        System.out.println("main 종료");
    }

    /***
     * static 키워드가 없는
     * non-static method 사용
     */
    public void methodA() {
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
    }
}


