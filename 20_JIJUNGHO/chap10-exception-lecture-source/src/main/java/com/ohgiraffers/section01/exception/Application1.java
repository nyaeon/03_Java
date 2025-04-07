package com.ohgiraffers.section01.exception;

public class Application1 {

    public static void main(String[] args) throws Exception {
        /*
        * 강제로 예외를 발생
        * throw new 예외클래스명();
        *
        * 예외처리 방법
        * 1. throws로 위임 - 프로그램이 강제 종료
        * 2. try-catch로 처리 - 예외처리가 난 부분을 건너뛰고, 실행
        * */

        ExceptionTest et = new ExceptionTest();
        et.checkEnougMoney(10000, 50000);
        System.out.println("============================================");
        et.checkEnougMoney(50000, 10000);

        System.out.println("프로그램을 종료합니다.");
    }
}
