package com.ohgiraffers.section01.method;

public class Calculator {
    public int plus(int first, int second) {
        return first + second;
    }

    public int minus(int first, int second) {
        return first - second;
    }

    public int pow(int first, int second) {
        return first * second;
    }

    public int div(int first, int second) {
        return first / second;
    }

    public int min(int first, int second) {
        return (first < second) ? first : second;
    }

    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }
}
