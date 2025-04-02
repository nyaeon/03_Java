package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section02.package_and_import.test.Calculator;

public class Application2 {
    public static void main(String[] args) {
        // non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10,20);
        System.out.println("result = " + result);

        int result2 = Calculator.maxNumbers(10,20);
        System.out.println("result2 = " + result2);

        Calculator cal2 = new Calculator();
        com.ohgiraffers.section02.package_and_import.test.Calculator cal3
                = new com.ohgiraffers.section02.package_and_import.test.Calculator();

        int result3 = maxNumberOf(10,20);
    }
}
