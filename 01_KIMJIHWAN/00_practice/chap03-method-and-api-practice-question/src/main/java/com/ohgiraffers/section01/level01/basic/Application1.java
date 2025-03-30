package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        /* Calculater 클래스의 메소드를 호출해서 실행 */
        Calculator cal = new Calculator();
        int x = 10;
        int y = 20;

        cal.checkMethod();

//        cal.checkMethod();    // 풀이(1)
        String strSum = cal.sumTwoNumber(x, y);
        System.out.println(strSum);

        String strMulti = cal.multi(x, y);
        System.out.println(strMulti);

        int intMulti = cal.multiTwoNumber2(x, y);
        System.out.println(x + "과 " + y + "곱은 " + intMulti + "입니다.");


//        cal.multiTwoNumber2(10, 20);

//        cal.multiThreeNumber2(10, 20);

    }
}
