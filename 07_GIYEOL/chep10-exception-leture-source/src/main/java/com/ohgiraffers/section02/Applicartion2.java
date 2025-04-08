package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexeception.Moneynagativeexcepation;
import com.ohgiraffers.section02.userexeception.NotEnougmoneyexcepation;
import com.ohgiraffers.section02.userexeception.Pricenegativeexcepation;

public class Applicartion2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(20000,30000);
        } catch (Pricenegativeexcepation e) {
            System.out.println("Pricenegativeexcepation 발생");
            System.out.println(e.getMessage());
         //   throw new RuntimeException(e);
        } catch (Moneynagativeexcepation e) {
            System.out.println("Monetnagetive 발생");
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        //    e.printStackTrace();
       //     throw new RuntimeException(e);
        } catch (NotEnougmoneyexcepation e) {
            System.out.println("notEnougmoneyexcepation 발생");
            System.out.println(e.getMessage());
          //  throw new RuntimeException(e);
        }
            finally {
                //try 구문이 정상 동작해도 실행됨
                // exception이 발생해도 finally 구문은 동작한다
            }
        System.out.println("종료");
    }
}
