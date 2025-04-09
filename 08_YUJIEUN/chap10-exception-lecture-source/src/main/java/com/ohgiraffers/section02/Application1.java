package com.ohgiraffers.section02;

public class Application1 {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try{
//            et.checkEnoughMoney(-50000,50000);
//            et.checkEnoughMoney(50000,-50000);
            et.checkEnoughMoney(50000,30000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
