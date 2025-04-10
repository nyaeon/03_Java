package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.ExceptionTest;

public class Application3 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(20000, -10000);
        } catch (PriceNegativeException | MoneyNegativeException  e) {
            System.out.println(e.getClass() + " 발생!!");
            System.out.println(e.getMessage());
        }  catch (NotEnoungMoneyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
