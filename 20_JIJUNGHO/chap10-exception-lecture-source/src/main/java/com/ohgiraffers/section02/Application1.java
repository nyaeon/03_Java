package com.ohgiraffers.section02;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();
        try {
            //            et.checkEnougMoney(-50000, 50000); // PriceNegativeException
            //            et.checkEnougMoney(10000, -50000); // MoneyNegativeException
            //            et.checkEnougMoney(50000, 30000); // NotEnoungMoneyException
            et.checkEnougMoney(10000, -50000);
        } catch (Exception e) {
            // 부모한테 받은 메소드의 메시지를 반환
            e.printStackTrace();
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
