package com.ogiraffers.section02.userException;

import com.ogiraffers.section01.exception.ExceptionTest;

public class Application3 {
    public static void main(String[] args) throws Exception {

        ExceptionTest et = new ExceptionTest();

        try {
            et.checkEnoughMoney(-20000, 10000);
        } catch (priceNegativeException | moneyNegativeException e) {
            System.out.println(e.getClass() + "occurs!!");
            System.out.println(e.getClass());
        } catch (notEnoughMoneyException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally occurs.");
        }
    }
}
