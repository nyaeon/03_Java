package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculator 클래스의 메소드를 호출해서 실행 */
        Calculator cal = new Calculator();
        cal.checkMethod();
        System.out.println(cal.sumTwoNumber(10, 20));
        System.out.println(cal.multiTwoNumber(10, 20));
        System.out.println("10과 20의 곱은 " + cal.multiTwoNumber2(10,20) + "입니다.");
    }
}
