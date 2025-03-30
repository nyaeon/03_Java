package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        cal.checkMethod();
        cal.sumTwoNumber(10, 20);
        cal.multiTwoNumber(10, 20);
        cal.multiTwoNumber2(10, 20);
    }
}
