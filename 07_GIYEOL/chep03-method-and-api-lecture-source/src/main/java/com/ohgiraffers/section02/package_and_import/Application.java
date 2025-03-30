package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;
//import static com.ohgiraffers.section01.method.Calculator.maxNumbers;
//import static com.ohgiraffers.section01.method.Calculator.minNumbers;
import static com.ohgiraffers.section01.method.Calculator.*;
public class Application {
    public static void main(String[] args) {
        //non-static method
        Calculator cal = new Calculator();
        int result = cal.plusTwoNumbers(10,20);
        System.out.println("결과는 " +result);
        int result2 =Calculator.maxNumbers(10,20);
        System.out.println("결과2는 "+ result2);

    com.ohgiraffers.section02.package_and_import.test.Calculator cal2
            = new   com.ohgiraffers.section02.package_and_import.test.Calculator();

        int result3 = maxNumbers(10,20);
        int result4 = minNumbers(10, 20);
    }
}
