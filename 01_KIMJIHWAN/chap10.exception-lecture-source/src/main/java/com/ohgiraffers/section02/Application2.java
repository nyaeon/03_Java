package com.ohgiraffers.section02;

import com.ohgiraffers.section02.ExceptionTest;
import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnougMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application2 {

    public static void main(String[] args)  {

        ExceptionTest et = new ExceptionTest();

        try {   // 어느 메세지, 클래스에서 발생했는지 catch를 통해 확인하는 방법
            et.checkEnoughMoney(20000, -20000);
        } catch (PriceNegativeException e ){
            System.out.println("PriceNegativeException 발생");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        } catch (MoneyNegativeException e ){
//            System.out.println("MoneyNegativeException 발생");
//            System.out.println(e.getMessage());
//            System.out.println("----->" + e.getClass());
//            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (NotEnougMoneyException e) {
            throw new RuntimeException(e);
        } finally {
            // try구문이 정상적으로 동작해도 실행하고.
            // exception이 발생해도 finally 구문이 동작한다.
        }


    }
}
