package com.ohgiraffers.section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        /**
         * 강제 예외 발생
         * throw new 예외 클래스 명();
         *
         * 예외 처리 방법
         * 1.throws로 위임
         * 2.try -catch로 처리
         */
        ExceptionTest et = new ExceptionTest();

        et.checkEnougMoney(10000, 50000);
        et.checkEnougMoney(50000, 10000);
        System.out.println("종료");

    }
}
