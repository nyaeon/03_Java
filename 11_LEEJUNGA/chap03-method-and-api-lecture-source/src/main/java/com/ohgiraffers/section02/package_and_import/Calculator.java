package com.ohgiraffers.section02.package_and_import;

public class Calculator {
    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }

    public int minNumberOf(int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;
    }

}
