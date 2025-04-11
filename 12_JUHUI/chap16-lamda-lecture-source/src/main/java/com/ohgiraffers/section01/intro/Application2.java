package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x + y; // 람다를 사용해 사용할 준비 완료.
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiply multiply = (x, y) -> x * y;
        OuterCalculator.Divide divide = (x, y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumbers(20, 10));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumbers(20, 10));
        System.out.println("20과 10의 곱 : " + multiply.multiplyTwoNumbers(20, 10));
        System.out.println("20과 10의 나누기 : " + divide.divideTwoNumbers(20, 10));

    }
}
