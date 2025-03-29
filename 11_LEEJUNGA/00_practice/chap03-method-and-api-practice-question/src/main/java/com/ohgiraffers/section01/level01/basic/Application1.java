package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        Calculator cal = new Calculator();
        cal.checkMethod();
        String result1 = cal.sumTwoNumber(10, 20);
        String result2 = cal.multiplyTwoNumber(10, 20);
        int result3 = cal.multiplyTwoNumber2(10, 20);
    }
}
