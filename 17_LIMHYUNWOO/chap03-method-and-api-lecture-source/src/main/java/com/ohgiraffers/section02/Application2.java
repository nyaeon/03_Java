package com.ohgiraffers.section02;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.selectMax;
import static com.ohgiraffers.section01.method.Calculator.selectMin;
import static com.ohgiraffers.section01.method.Calculator.*;

public class Application2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumber(10, 20);
        System.out.println("result = " + result);

        int result2 = selectMax(10,20);
        System.out.println("result2 = " + result2);

        com.ohgiraffers.section02.package_and_import.test.Calculator cal2
                = new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int result3 = selectMax(10 ,20);
        int result4 = selectMin(10 , 20);
    }
}
