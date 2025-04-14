package com.ohgiraffers.section01.intro;

// 인터페이스는 추상메소드와 상수필드만 들어올 수 있다.
public class CalculatorImpl implements Calculator {

    @Override
    public int subTwoNumber(int a, int b) {
        return a + b;
    }
}
