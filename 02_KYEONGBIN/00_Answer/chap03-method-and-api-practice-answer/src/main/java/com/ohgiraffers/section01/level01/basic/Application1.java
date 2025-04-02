package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        /* non-static 메소드 호출 방법 */
        Calculator calc = new Calculator();
        calc.checkMethod();

//		Calculator calc2 = new Calculator();
        int first = 10;
        int second = 20;
        String result = calc.sumTwoNumber(first, second);
        System.out.println(result);

        System.out.println(calc.sumTwoNumber(first, second));

        String result2 = calc.multiTwoNumber(first, second);
        System.out.println(result2);

        int result3 = calc.multiTwoNumber2(first, second);
        System.out.println("10과 20의 곱은 " + result3 + "입니다.");

    }
}
