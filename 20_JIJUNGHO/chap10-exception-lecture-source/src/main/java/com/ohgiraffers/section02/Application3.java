package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoungMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application3 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(20000, 10000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            System.out.println(e.getClass() + " 발생!!!");
            System.out.println(e.getMessage());
        } catch (NotEnoungMoneyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally 블럭의 내용이 동작함");
        }
    }
}
