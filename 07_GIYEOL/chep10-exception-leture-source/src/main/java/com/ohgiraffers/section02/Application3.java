package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexeception.Moneynagativeexcepation;
import com.ohgiraffers.section02.userexeception.NotEnougmoneyexcepation;
import com.ohgiraffers.section02.userexeception.Pricenegativeexcepation;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnougMoney(20000,-10000);
        }catch (Pricenegativeexcepation | Moneynagativeexcepation e) {
            System.out.println(e.getClass()+"발생");
            System.out.println(e.getMessage());
        }catch (NotEnougmoneyexcepation e){
            e.printStackTrace();
        } finally {
            System.out.println("finally 동작");
        }
        System.out.println("종료");
    }
}
