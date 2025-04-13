package com.ohgiraffers.section01.intro;

import org.w3c.dom.ls.LSOutput;

public class Application2 {

    public static void main(String[] args) {

        // 람다를 통해 사용할 준비 완료
        // OuterCalculator 클래스안에 Sum 추상메소드 가져옴.
        OuterCalculator.Sum sum = (x, y) -> x + y;
        OuterCalculator.Minus minus = (x, y) -> x - y;
        OuterCalculator.Multiple multiple = (x, y) -> x * y;
        OuterCalculator.Devide devide = (x, y) -> x / y;

        System.out.println("20과 10의 합 : " + sum.sumTwoNumber(20, 10));
        System.out.println("20과 10의 차 : " + minus.minusTwoNumber(20, 10));
        System.out.println("20과 10의 곱 : " + multiple.multipleTwoNumber(20, 10));
        System.out.println("20과 10의 나누기 : " + devide.devideTwoNumber(20, 10));
    }
}
