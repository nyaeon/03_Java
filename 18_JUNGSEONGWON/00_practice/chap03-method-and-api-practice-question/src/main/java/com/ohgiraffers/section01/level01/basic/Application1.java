package com.ohgiraffers.section01.level01.basic;


public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.checkMethond();
        System.out.println( cal.sumTwoNumber(10, 20));
        System.out.println( cal.multiTwoNumber(10,20));
        System.out.println( cal.multiTwoNumber2(10,20));
    }
}
