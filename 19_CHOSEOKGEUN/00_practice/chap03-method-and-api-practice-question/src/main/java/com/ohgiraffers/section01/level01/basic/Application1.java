package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드 */
    public static void main(String[] args) {

        // Calculator 클래스의 객체 생성
        Calculator calculator = new Calculator();

        // 1. checkMethod 호출
        calculator.checkMethod();  // "메소드 호출 확인" 출력

        // 2. sumTwoNumber 메소드 호출
        String sumResult = calculator.sumTwoNumber(10, 20);
        System.out.println(sumResult);  // "10과 20의 합은 30입니다." 출력

        // 3. multiTwoNumber 메소드 호출
        String multiResult = calculator.multiTwoNumber(10, 20);
        System.out.println(multiResult);  // "10과 20의 곱은 200입니다." 출력

        // 4. multiTwoNumber2 메소드 호출
        int multiResult2 = calculator.multiTwoNumber2(10, 20);
        System.out.println("10과 20의 곱은 " + multiResult2 + "입니다.");  // "10과 20의 곱은 200입니다." 출력
    }
}
