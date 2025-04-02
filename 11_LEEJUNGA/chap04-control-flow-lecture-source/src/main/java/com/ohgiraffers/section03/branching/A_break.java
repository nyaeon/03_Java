package com.ohgiraffers.section03.branching;

public class A_break {
    public void testSimpleBreakStatement() {
        int sum = 0;
        int i = 1;
        while (true) { // 조건식
            // 실행할 구문
            sum += 1;
            System.out.println("sum = " + sum);

            if (i == 10) {
                break;
            }

            i++; // 증감식
        }
    }
}
