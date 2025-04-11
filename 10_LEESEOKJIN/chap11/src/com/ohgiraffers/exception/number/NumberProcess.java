package com.ohgiraffers.exception.number;

public class NumberProcess {
    public static boolean checkDouble(int a, int b) throws NumberRangeException {
        if (a < 1 || a > 100) throw new NumberRangeException();
        if (b < 1 || b > 100) throw new NumberRangeException();
        return a % b == 0;
    }
}
