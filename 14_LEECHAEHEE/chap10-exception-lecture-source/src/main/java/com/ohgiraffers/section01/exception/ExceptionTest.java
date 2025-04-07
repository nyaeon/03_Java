package com.ohgiraffers.section01.exception;

public class ExceptionTest {
        public void checkEnoughMoney(int price, int money) {
            System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

            if (money >= price) {
                System.out.println("금액이 충분합니다.");
            } else {
//                System.out.println("금액이 부족합니다.");
                throw new RuntimeException();
            }
            System.out.println("즐거운 쇼핑하세요~");
        }

}
