package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        Calculator calculator = new Calculator();

        calculator.checkMethod();

        System.out.println(calculator.sumTwoNumber(10, 20));

        System.out.println(calculator.multiTwoNumber(10, 20));

        int product = calculator.multiTwoNumber2(10, 20);
        System.out.println("10과 20의 곱은 " + product + "입니다.");
    }
}
