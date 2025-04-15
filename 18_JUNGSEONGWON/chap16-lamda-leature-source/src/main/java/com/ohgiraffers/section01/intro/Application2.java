package com.ohgiraffers.section01.intro;

public class Application2 {

    public static void main(String[] args){

        OuterCalculator.Sum sum = (x,y) -> x+y; // 추상메소드가 무엇이 있는 지 알려주는 것은 sum 전에 문장들이다.
        OuterCalculator.Minus minus = (x,y) -> x-y;
        OuterCalculator.Multiple mutiple = (x,y) -> x*y;
        OuterCalculator.Devide devide = (x,y) -> x%y;
        System.out.println("20과 10의 합 : " + sum.sumToNuber(20, 10));
        System.out.println("20과 10의 차 : " + minus.minusToNuber(20, 10));
        System.out.println("20과 10의 곱 : " + mutiple.multipleToNumber(20, 10));
        System.out.println("20과 10의 나누기 : " + devide.divideToNumber(20, 10));


    }
}
