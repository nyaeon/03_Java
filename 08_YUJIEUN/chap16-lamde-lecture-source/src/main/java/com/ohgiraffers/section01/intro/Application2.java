package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (int x, int y) -> x + y;
        OuterCalculator.Minus minus = (int x, int y) -> x - y;
        OuterCalculator.Multiple multiple = (int x, int y) -> x * y;
        OuterCalculator.Devide devide = (int x, int y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumbers(20,10));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumbers(20,10));
        System.out.println("20과 10의 곱 : " + multiple.multipleTwoNumbers(20,10));
        System.out.println("20과 10의 나누기 : " + devide.devideTwoNumbers(20,10));

    }
}
