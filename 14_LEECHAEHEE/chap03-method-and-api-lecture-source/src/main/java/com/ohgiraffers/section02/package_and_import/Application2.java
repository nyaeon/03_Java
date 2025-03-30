package com.ohgiraffers.section02.package_and_import;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.max;

public class Application2 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result = cal.plus(10, 20);
        System.out.println("result = " + result);
        int result2 = max(10, 20);
        System.out.println("result2 = " + result2);

        com.ohgiraffers.section02.package_and_import.Calculator cal2 =
                new com.ohgiraffers.section02.package_and_import.Calculator();
        // 한 패키지에서 똑같은 클래스명을 사용할 수 없다. 사용하려면 패키지 경로까지 명시해줘야 한다.

        int result3 = max(10, 20);
    }
}
