package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoungMoneyException;
import com.ohgiraffers.section02.userexception.PriceNagativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000,-30000);
        }catch (PriceNagativeException e) {
            System.out.println("PriceNagativeException 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
//            System.out.println("MoneyNegativeException 발생");
//            System.out.println("---> "+e.getClass());
//            System.out.println(e.getMessage());
              e.printStackTrace();
              throw new RuntimeException(e);
        } catch (NotEnoungMoneyException e) {
            System.out.println("NotEnoungMoneyException 발생");
            System.out.println(e.getMessage());
        }finally {
            // try 구문이 정삭적으로 동작해도 실행하고,
            //
            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
