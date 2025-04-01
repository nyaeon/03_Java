package com.ohgiraffers.section02.package_and_import.test;

public class Calculator {
<<<<<<< HEAD


    public int plusTwoNumbers(int first, int second) {
        return  first + second;
    }

    public int subTwoNumbers(int first, int second) {
        return first - second;
    }

    public int minNumberOf(int first, int second) {
        return (first > second) ? second : first;
    }

    public static int maxNumberOf(int first, int second) {
        return (first > second) ? first : second;
    }


=======
    public int plusTwoNumbers(int first, int second) {
        return first + second;
    }

    public int minusTwoNumbers(int first, int second) {
        return first - second;
    }

    public int multipleTwoNumbers(int first, int second) {
        return first * second;
    }

    public int divideTwoNumbers(int first, int second) {
        if (second == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        return first / second;
    }

    public int maxNumberOf(int i, int i1) {
        return Math.max(i, i1);
    }
>>>>>>> a8fb790 (수정4)
}
