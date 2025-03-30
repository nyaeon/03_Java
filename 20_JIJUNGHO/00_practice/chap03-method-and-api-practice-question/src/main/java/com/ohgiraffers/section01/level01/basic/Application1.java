package com.ohgiraffers.section01.level01.basic;

import static com.ohgiraffers.section01.level01.basic.Calculator. *;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        // 메소드 호출 확인
        Calculator cal = new Calculator();
        cal.checkMethod();

        // 10과 20의 합은 30입니다.
        String result = sumTwoNumber(10,20);
        System.out.println(result);

        // 10과 20의 곱은 200입니다.
        String result2 = multiTwoNumber(10, 20);
        System.out.println(result2);

        // 10과 20의 곱은 200입니다.
        System.out.println("10과 20의 곱은 " + multiTwoNumber2(10,20) + "입니다.");

    }

}
