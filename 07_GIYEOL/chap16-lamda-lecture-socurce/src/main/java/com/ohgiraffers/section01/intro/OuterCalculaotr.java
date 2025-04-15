package com.ohgiraffers.section01.intro;

public interface OuterCalculaotr {
    public interface sum{
        int sumTowNUmber(int a, int b);

        String minusTowNUmber(int a, int b);

        String multiplyTowNumber(int a, int b);

        String multipleTowNumber(int a, int b);
    }
    @FunctionalInterface
    public interface Minus{
        int minustowNumber(int a, int b);;
    }
    @FunctionalInterface
    public interface Multiply{
        int multiply(int a, int b);
    }
    @FunctionalInterface
    public interface Divide{
        int divideTwonumber(int a, int b);
    }

}
