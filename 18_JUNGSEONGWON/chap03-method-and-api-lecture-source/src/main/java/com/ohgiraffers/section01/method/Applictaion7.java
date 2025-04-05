package com.ohgiraffers.section01.method;

public class Applictaion7 {

    public static void main(String[] args) {

        int first = 100;
        int second = 50;

        Calculator cal = new Calculator(); // 객체 생성

        // 덧셈
        System.out.println("두 수의 합은 ? " + cal.plusTwoNumbers(first, second));

        // 두 수 중의 최소값 구하기
        System.out.println("두 수 중 작은 값은? " + cal.minNumberOf(first, second) );

        // 두 수 중의 최대값 구하기
        System.out.println("두 수 중 큰 값은? (static 메소드) >> " + Calculator.maxNumberOf(first, second));

    }
}
