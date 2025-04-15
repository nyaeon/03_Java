package com.ohgiraffers.section01.intro;

public interface OuterCalculator {
// 인터페이스에 안에 여러개의 FunctionalInterface을 생성 할 수 있다. (중첩 인터페이스)
    @FunctionalInterface
    public interface Sum {
        int sumTwoNumnber(int a, int b);
    }

    @FunctionalInterface
    public interface Minus {
        int minusTwoNumnber(int a, int b);
    }

    @FunctionalInterface
    public interface Multiple{
        int multiple(int a, int b);
    }

    @FunctionalInterface
    public interface Devide {
        int devideTwoNumnber(int a, int b);
    }

}
