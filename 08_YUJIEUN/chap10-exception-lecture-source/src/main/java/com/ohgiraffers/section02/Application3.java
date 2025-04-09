package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoungMoneyException;
import com.ohgiraffers.section02.userexception.PriceNagativeException;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000,-10000);
        } catch (PriceNagativeException | MoneyNegativeException e) {
            System.out.println(e.getClass()+ " 발생!! ");
            System.out.println(e.getMessage());
        } catch (NotEnoungMoneyException e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally 블럭의 내용이 동작함");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
