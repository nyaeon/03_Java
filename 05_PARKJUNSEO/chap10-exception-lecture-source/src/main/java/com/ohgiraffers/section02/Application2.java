package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoungMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(-20000, 30000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
            e.getMessage();
//            System.out.println("MoneyNegativeException 발생");
//            System.out.println(e.getMessage());
//            System.out.println("---->" + e.getClass());
//            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (NotEnoungMoneyException e) {
            System.out.println("NotEnoungMoneyException 발생");
            System.out.println(e.getMessage());
        }finally {
            // try구문이 정상적으로 동작해도 실행하고,
            // exception이 발생해도 finally 구문은 동작을 한다.
            System.out.println("finally 블럭의 내용이 동작함");
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
