package com.ohgiraffers.section01.method;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작됨");
        Application2 app = new Application2(); // static이 아니므로 메소드 사용 위해 객체 생성 해줘야함
        app.methodA();
        app.methodC();
        app.methodB();
        System.out.println("main() 종료됨");
    }

    /***
     * static 키워드가 없는
     * non-static method 사용
     */
    public void methodA() {
        System.out.println("methodA() 호출됨");
        System.out.println("methodA() 종료됨");
    }

    public void methodB() {
        System.out.println("methodB() 호출됨");
        System.out.println("methodB() 종료됨");
    }

    public void methodC() {
        System.out.println("methodC() 호출됨");
        System.out.println("methodC() 종료됨");
    }
}
