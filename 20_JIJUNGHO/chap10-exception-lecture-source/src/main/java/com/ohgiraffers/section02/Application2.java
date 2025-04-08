package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoungMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(20000, 30000);
        } catch (PriceNegativeException e) {
            //            System.out.println("PriceNegativeException 발생!");
            //            // 내가 입력받은(예외 발생 시 출력할 문구) 메시지를 출력
            //            System.out.println(e.getMessage());
            //            // 어느 클래스(파일 경로)에서 오류가 발생했는지
            //            System.out.println(e.getClass());

            // getClass, getMessage 합친거
            //            e.printStackTrace();
            // 실행 중에 오류가 발생한것
            throw new RuntimeException(e);
        } catch (MoneyNegativeException e) {
            System.out.println("MoneyNegativeException 발생!");
        } catch (NotEnoungMoneyException e) {
            System.out.println("NotEnoungMoneyException 발생!");
        } finally {
            // try 구문이 정상적으로 동작해도 실행하고,
            // exception이 발생해도 finally 구문은 동작을 한다.
            System.out.println("finally 구문 발생!");
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
