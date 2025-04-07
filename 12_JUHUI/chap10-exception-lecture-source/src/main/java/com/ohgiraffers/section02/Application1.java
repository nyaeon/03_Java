package com.ohgiraffers.section02;

public class Application1 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {
            //et.checkEnougMoney(-50000,50000);// 오류 부분 내용에 대한 출력확인하기 위해
            //et.checkEnougMoney(50000, -50000);
            et.checkEnougMoney(50000,30000);
        } catch (Exception e) {
            e.printStackTrace();//어느 시점에 오류가 났는지 출력해줌.

        }

        System.out.println("프로그램을 종료합니다.");
    }
}
