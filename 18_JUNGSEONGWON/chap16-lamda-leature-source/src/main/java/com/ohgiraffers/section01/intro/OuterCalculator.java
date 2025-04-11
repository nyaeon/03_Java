package com.ohgiraffers.section01.intro;

public interface OuterCalculator {

    @FunctionalInterface //람다식을 사용하기 위해 선언 해주는 것이다.
    public interface Sum{
        int sumToNuber(int a, int b);
    }
    @FunctionalInterface
    public interface Minus{
        int minusToNuber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple{
        int multipleToNumber(int a, int b);
    }

    @FunctionalInterface
    public interface Devide{
        int divideToNumber(int a, int b);
    }
}
