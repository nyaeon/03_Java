package com.ohgiraffers.section01.intro;

public interface OuterCaculator {
    @FunctionalInterface
    public interface Sum{
        int sumTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus{
        int minusTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple{
        int multipleTwoNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Devide{
        int divideTwoNumber(int a, int b);
    }
}
