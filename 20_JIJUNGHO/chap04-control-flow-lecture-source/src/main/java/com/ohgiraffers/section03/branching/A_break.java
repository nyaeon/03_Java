package com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement() {

        int sum = 0;
        int i = 1; // 초기식

        while (true) { // 조건식
            // 실행할 구문
            sum = +i;
            System.out.println("sum = " + sum);

            if (i == 10) {
                break; // 가장 가까운 반복문을 빠져나간다.
            }

            i++; // 증감식
        }
    }

    public void testJumpBreak() {

        // 초기식, 조건식, 증감식이 없음 (무한루프)
        // brack
        // 결과 : 0,1,2,3 무한루프
        // label : 특정한 위치로 break, continue를 실행
        label:
        for (; ; ) {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

                if (i == 3) {
                    break label;
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
            System.out.println("for문");
        }
        System.out.println("메소드 끝");
    }
}
