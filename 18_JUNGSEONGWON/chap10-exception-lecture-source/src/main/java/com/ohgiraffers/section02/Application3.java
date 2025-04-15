package com.ohgiraffers.section02;

import com.ohgiraffers.section02.userexception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.NotEnoughMoneyException;
import com.ohgiraffers.section02.userexception.PriceNegativeException;

public class Application3 {
    public static void main(String[] args){

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnougMoney(20000,-10000);
        } catch (PriceNegativeException | MoneyNegativeException e) {
            throw new RuntimeException(e.getClass() + "발생 !!!");
        }catch (NotEnoughMoneyException e) {
            e.printStackTrace();
        }finally{
            System.out.println("finally 블럭의 내용이 동작함");
        }

    }
}
