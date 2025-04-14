package com.ohgiraffers.section01.intro;

public interface OuterCalculator {

    @FunctionalInterface
    public interface Sum {
        int sumTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Multiply {
        int multiplyTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public interface Divide {
        int divideTwoNumbers(int a, int b);
    }
}
