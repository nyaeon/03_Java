package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        Calculator cal = new Calculator();

        cal.checkMethod();

        int a = 10;
        int b = 20;

        String result  = cal.sumTwoNumber(a,b);
        System.out.println(result);

        System.out.println(cal.sumTwoNumber(a,b));

        String result2 = cal.multiTwoNumber(a,b);
        System.out.println(result2);

        int result3 = cal.multiTwoNumber2(a,b);
        System.out.println("10과 20의 곱은 "+result3+"입니다.");


    }
}
