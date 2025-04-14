package com.ohgiraffers.section01.jupiter;

public class NumberValidation {

    public void checkDividableNumber(int firstNum, int secondNum) {
        if(secondNum == 0) throw new IllegalArgumentException("0으로 돌아갈 수 없다");
    }
}
