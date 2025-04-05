package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        /* Calculater 클래스의 메소드를 호출해서 실행 */
        // Application1.java의 main 메소드 내부에서:
        Calculator calculator = new Calculator();
        calculator.checkMethod();

        String result = calculator.sumTwoNumber(10, 20);
        System.out.println("결과: " + result);

        String multiResult = calculator.multiTwoNumber(10, 20);
        System.out.println("곱셈 결과: " + multiResult);

        int multiResult2 = calculator.multiTwoNumber2(10, 20);
        System.out.println("곱셈 결과: " + multiResult2);
    }
}
