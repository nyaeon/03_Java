package com.ohgiraffers.section01.intro;

import java.sql.SQLOutput;

public class Application2 {

    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multiple = (x, y) -> x * y;
        OuterCalculator.Devide divide = (x, y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(10, 10));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 곱 : " + multiple.multipleTwoNumber(20, 10));
        System.out.println("20과 10의 나누기 : " + divide.devideTwoNumber(20, 10));

    }
}
