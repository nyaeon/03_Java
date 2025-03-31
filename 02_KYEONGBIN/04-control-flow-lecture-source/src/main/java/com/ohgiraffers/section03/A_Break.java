package com.ohgiraffers.section03;

public class A_Break {
    public void testSimpleBreakStatement() {

        int sum = 0;
        int i = 1; // 초기식

        while (true) {
            sum +=i;
            System.out.println("sum = " + sum);

            i++; // 증감식

            if (i == 10) {
                break; // 가장 가까운 반복문을 빠져나간다.
            }
            i++;
        }
    }

    public void testJumpBreak() {
        label:
        for(;;) {
            for(int i = 0 ; i < 10; i++) {
                System.out.println((i));

                if(i == 3) {
                    break label; // label을 멈춰줘
                }
            }
        }
    }

    public void testReturnStatement() {

        for (int i = 0; i < 3; i++) {
            if (i == 1) {
                System.out.println("출력완료");
                break;
            }
            System.out.println("for문 출력");

        }
        System.out.println("메소드 끝");
//        return null; 
    }

}
