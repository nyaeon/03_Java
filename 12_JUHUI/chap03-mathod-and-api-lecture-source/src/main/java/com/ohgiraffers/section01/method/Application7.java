package com.ohgiraffers.section01.method;

import com.ohgiraffers.section02.package_and_import.test.Calculator;

public class Application7 {
    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은? " + cal.plusTwoNumbers(first,second));

        // 두 수 중의 최소값 구하기
        System.out.println("두 수의 작은 값은? " + cal.plusTwoNumbers(first,second));

        // 두 수 중의 최대값 구하기
        System.out.println("두 수의 큰 값은? (static 메소드) >> " + Calculator.maxNumbers(first,second));

    }
}
