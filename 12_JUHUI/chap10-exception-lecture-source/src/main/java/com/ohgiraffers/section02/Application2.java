package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userException.MoneyNegativeException;
import com.ohgiraffers.section02.userException.NotEnougMoneyException;
import com.ohgiraffers.section02.userException.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(20000,30000);
        } catch (PriceNegativeException e) {
            //throw new RuntimeException(e);
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
            //System.out.println(e.getClass()); // 어디에서 오류생겼는지도 알 수 있음.
        } catch (MoneyNegativeException e) {
//            System.out.println("MoneyNegativeException 발생");
//            System.out.println(e.getMessage());
//            System.out.println("-----> " + e.getClass());
//            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (NotEnougMoneyException e) {
            System.out.println("NotEnougMoneyException 발생");
            System.out.println(e.getMessage());
        } finally {
            // try 구문이 정상적으로 동작해도 실행하고,
            // exception이 발생해도 finally 구문이 실행된다.
            System.out.println("finally 블럭의 내용이 동작함");
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
