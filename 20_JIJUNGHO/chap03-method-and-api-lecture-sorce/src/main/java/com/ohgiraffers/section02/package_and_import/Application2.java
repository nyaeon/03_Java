package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

// 개별마다 import 문을 선언해줘야하지만,
//import static com.ohgiraffers.section01.method.Calculator.maxNumberOf;
//import static com.ohgiraffers.section01.method.Calculator.minNumberOf;

// static 메소드를 전부 포함(import)하겠다.
import static com.ohgiraffers.section01.method.Calculator.*;


public class Application2 {
    public static void main(String[] args) {

        // non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10,20);
        System.out.println("result = " + result);

        int result2 = maxNumberOf(10, 20);
        System.out.println("result2 = " + result2);

        com.ohgiraffers.section02.package_and_import.test.Calculator cal2
                = new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int result3 = maxNumberOf(10, 20);
        int result4 = minNumberOf(10, 20);
    }
}
