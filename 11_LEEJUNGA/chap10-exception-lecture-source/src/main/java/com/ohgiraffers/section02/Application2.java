package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoungMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;
import org.w3c.dom.ls.LSOutput;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnougMoney(20000, -30000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
//            System.out.println("MoneyNegativeException 발생");
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
            e.printStackTrace();
        } catch (NotEnoungMoneyException e) {
            System.out.println(e.getMessage());
            System.out.println("NotEnoungMoneyException 발생");
        } finally {
            // try 구문이 정상적으로 동작해도 실행하고,
            // exception이 발생하도 finally 구문은 동작을 한다.
            System.out.println("finally~~~");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
