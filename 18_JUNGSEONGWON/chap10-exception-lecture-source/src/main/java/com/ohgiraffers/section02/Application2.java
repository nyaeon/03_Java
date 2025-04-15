package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(20000,30000);
        } catch (PriceNegativeException e) {
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {
//            System.out.println("MoneyNegativeException 발생");
              // 오류를 나타내는 구문들
//            System.out.println(e.getMessage()); // 설정한 오류 멘트를 보여준다.
//            System.out.println("====>" +e.getClass()); // 오류 난 클래스의 위치를 알려준다.
//            e.printStackTrace(); // 멘트와 클래스 위치를 보여준다.
            throw new RuntimeException(e);
        } catch (NotEnoughMoneyException e) {
            System.out.println("NotEnoughMoneyException 발생");
            System.out.println(e.getMessage());
        } finally{ // try 구문이 정상적으로 동작해도 실행하고, exception이 발생해도 finally 구문은 동작을 한다.
            System.out.println("finally 블럭의 내용이 동작함");
        }
        // 상속 구문을 사용 할 때 역방향(좁은 범위에서 넓은 범위로)으로 상속 구조를 생각하고 설계해준다.
        System.out.println("프로그램을 종료합니다");
    }
}
