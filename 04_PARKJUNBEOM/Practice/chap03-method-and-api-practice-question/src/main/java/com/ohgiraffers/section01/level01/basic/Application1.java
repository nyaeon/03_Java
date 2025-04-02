package com.ohgiraffers.section01.level01.basic;

import com.ohgiraffers.section01.level01.basic.Calculator;

import static com.ohgiraffers.section01.level01.basic.Calculator.*;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {

        com.ohgiraffers.section01.level01.basic.Calculator cal
                = new com.ohgiraffers.section01.level01.basic.Calculator();

        String sumResult = cal.sumTwoNumber(10, 20);
        System.out.println(sumResult);

        String multiResult = cal.multiTwoNumber(10, 20);
        System.out.println(multiResult);

        int multi2Result = cal.multiRwoNumber2(10, 20);
        /* Calculater 클래스의 메소드를 호출해서 실행 */
    }
}
