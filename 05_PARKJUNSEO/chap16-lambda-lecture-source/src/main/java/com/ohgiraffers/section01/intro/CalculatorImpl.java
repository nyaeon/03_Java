package com.ohgiraffers.section01.intro;

// 이름에서 알 수 있듯이, Calculator 인터페이스에 implement를 달아준 구현체임

public class CalculatorImpl implements Calculator {

    @Override
    public int sumTwoNumber(int a, int b) {
        return a + b;
    }
}
