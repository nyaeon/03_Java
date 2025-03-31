package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        int first = 100;
        int second = 50;

        Calculator cal = new Calculator();

        //덧셈
        System.out.println("두 수의 합 : " + cal.plus(first, second));

        //뺄셈
        System.out.println("두 수의 차 : " + cal.minus(first, second));

        // 최소값
        System.out.println("두 수 중 작은 값은? " + cal.min(first, second));

        // 최대값
        System.out.println("두 수 중 큰 값은? " + Calculator.max(first, second));

    }




}
