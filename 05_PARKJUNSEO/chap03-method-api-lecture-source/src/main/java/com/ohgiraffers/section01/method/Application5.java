package com.ohgiraffers.section01.method;

public class Application5 {

    public static void main(String[] args) {

        Application5 app = new Application5();
        app.testMethod();
    }

    public void testMethod() {
        System.out.println("testMethod() 동작 확인");

//          return이 생략되어있음 (메소드를 호출한 곳으로 돌아가기 위해서
//                     return을 작성 안해도 컴파일러가 자동으로 추가해줌)
    }
}
