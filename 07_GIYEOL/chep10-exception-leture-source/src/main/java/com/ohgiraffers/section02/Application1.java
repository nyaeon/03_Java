package com.ohgiraffers.section02;

import com.ohgiraffers.section01.exception.ExceptionTest;
import org.w3c.dom.ls.LSOutput;

public class Application1 {
    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try{
    //        et.checkEnougMoney(-50000, 50000);
    //        et.checkEnougMoney(100, -100);
            et.checkEnougMoney(500, 300);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }

}
