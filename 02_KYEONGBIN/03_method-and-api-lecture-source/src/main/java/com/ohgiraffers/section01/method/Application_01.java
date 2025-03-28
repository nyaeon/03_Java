package com.ohgiraffers.section01.method;

public class Application_01 {

    public static void main(String[] args) { // 메인 메서드
        // public : 모든 클래스에서 접근 가능
        // static : 객체 생성 없이 실행 가능
        // void : 반환값 없음
        // main : 프로그램의 시작점
        // String[] args : 커맨드라인에서 입력받은 값을 배열 형태로 전달

        System.out.println("Main() is started");

        // methodA 호출
        methodA();

        System.out.println("Main() is finished");
    }

    public static void methodA() {
        System.out.println("methodA() 호출됨");
        methodB(); // methodB 호출
        System.out.println("methodA() 종료됨");
    }

    public static void methodB() {
        System.out.println("methodB() 호출됨");
    }
}