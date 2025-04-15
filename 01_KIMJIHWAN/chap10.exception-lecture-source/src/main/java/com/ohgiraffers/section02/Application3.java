package com.ohgiraffers.section02;

import com.ohgiraffers.section02.ExceptionTest;
import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnougMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) throws Exception {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(20000, -10000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            System.out.println(e.getClass() + " 발생!!");
            System.out.println(e.getMessage());
        } catch (NotEnougMoneyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
