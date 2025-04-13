package com.ohgiraffers.section01.intro;

import org.w3c.dom.ls.LSOutput;

public class Application2 {
    public static void main(String[] args) {

        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multi = (x, y) -> x * y;
        OuterCalculator.Devide devide = (x, y) -> x / y;
        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(10, 20));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 곱 : " + multi.multipleTwoNumber(10, 20));
        System.out.println("20과 10의 나누기 : " + devide.devideTwoNumber(10, 20));



    }

}
