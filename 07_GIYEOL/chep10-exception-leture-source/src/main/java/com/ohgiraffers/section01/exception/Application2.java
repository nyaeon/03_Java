package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(10000,50000);
            System.out.println("======= 상품 구입 가능 =======");
        } catch (Exception e) {
            System.out.println("======= 상품 구입 불가 =======");
           // throw new RuntimeException(e);
        }
        System.out.println("프로그램 종료");
    }
}
