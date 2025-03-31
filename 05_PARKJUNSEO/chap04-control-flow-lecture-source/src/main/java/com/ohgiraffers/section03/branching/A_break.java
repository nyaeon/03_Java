package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement() {

        int sum = 0;
        int i = 1;

        while (true) {//초기식
            // 실행할 구문
            sum += i;
            System.out.println("sum = " + sum);;

            if (i == 10) {
                break;    // 가장 가까운 반복문을 빠져나감
            }
        }

        /* label:
        for ( ; ; ) {           // 무한반복
            for (int i = 0; i < 10; i++) {
                System.out.printle(i);
                if (i==3) {
                    break label;
                }
            }
         */



    }



}
