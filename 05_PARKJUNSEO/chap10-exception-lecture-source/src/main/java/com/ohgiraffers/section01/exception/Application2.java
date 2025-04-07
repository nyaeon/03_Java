package com.ohgiraffers.section01.exception;

public class Application2 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {   // 실제로 동작하는 구문을 try 구문에 넣어줌 // 특정 문제가 발생하여 예외가 발생하면 catch 구문에서 잡음
            et.checkEnoughMoney(10000, 50000);
            System.out.println("======== 상품 구입 가능 ========");
        } catch (Exception e) { // exception이 발생하면 catch 하겠다는 것
            System.out.println("======== 상품 구입 불가능 ========");

        }


    }
}
