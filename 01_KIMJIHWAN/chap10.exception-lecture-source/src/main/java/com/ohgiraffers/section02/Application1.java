package com.ohgiraffers.section02;

import com.ohgiraffers.section02.ExceptionTest;

public class Application1 {

    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try {
//            et.checkEnougMoney(50000, 50000);
            et.checkEnoughMoney(50000, -50000);
        } catch (Exception e) { // throw 발생
            e.printStackTrace();
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
