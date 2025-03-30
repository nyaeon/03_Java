package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        // 덧셈
        System.out.println("두 수의 합은? " + cal.plusTwoNumbers(first, second));

        // 뺄셈
        System.out.println("두 수의 차는? " + cal.subTwoNumbers(first, second));

        // 최솟값
        System.out.println("두 수 중에 작은 값은? " + cal.minNumberOf(first, second));

        // 최대값
        System.out.println("두 수 중에 큰 값은? (static 메소드) " + Calculator.maxNumberOf(first, second));
    }
}
