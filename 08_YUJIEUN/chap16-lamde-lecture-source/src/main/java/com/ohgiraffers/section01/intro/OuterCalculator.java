package com.ohgiraffers.section01.intro;

public interface OuterCalculator {

    @FunctionalInterface
    public interface Sum{
        int sumTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public  interface  Minus {
        int minusTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public  interface  Multiple {
        int multipleTwoNumbers(int a, int b);
    }

    @FunctionalInterface
    public  interface  Devide {
        int devideTwoNumbers(int a, int b);
    }
}
