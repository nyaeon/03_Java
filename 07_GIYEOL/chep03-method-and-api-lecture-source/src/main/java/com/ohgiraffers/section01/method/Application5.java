package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        Application5 app = new Application5();
        app.testmethod();
    }
    public void testmethod() {
    System.out.println("testmethod() 동작확인");
    return; //메소드를 호출한 곳으로 돌아가기 위해 return을 작성, 안적어도 컴파일러가 자동으로 추가해줌
}}
