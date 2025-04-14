package com.ohgiraffers.section01.intro;

//구현한 구현체 Impl 약어 붙여줌으로써 나타냄.
public class CalculatorImpl implements Calculator {
    @Override
    public int sumTwoNumbers(int a, int b) {
        return a + b;
    }
}
