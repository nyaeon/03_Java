package com.ohgiraffers.section01.level01.basic;


public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.checkMethond();
        System.out.println( cal.sumTwoNumber(10, 20));
        cal.multiTwoNumber(10,20);
        System.out.println( cal.multiTwoNumber(10,20));
        int x = 10;
        int y = 20;
        System.out.println(x + "과" + y + " 의 곱은 " + (x * y) + " 입니다.");
    }
}
