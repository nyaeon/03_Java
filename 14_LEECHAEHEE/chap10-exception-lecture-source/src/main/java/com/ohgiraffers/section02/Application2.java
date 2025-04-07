package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(20000, -30000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e){
//            System.out.println("MoneyNegativeException 발생");
//            System.out.println(e.getMessage());
//            System.out.println("-----> " + e.getClass());
//            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        } finally {
            // 예외 발생 여부와 상관 없이 꼭 실행되어 처리해야 할 코드가 있으면 작성하는 블럭
            System.out.println("finally 블럭의 내용이 동작함");
        }
        System.out.println("프로그램을 종료합니다.");
        }
}
