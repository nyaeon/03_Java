package com.ohgiraffers.section03.branching;

public class B_continue {

    public void testSimpleContinueStatement() {

        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println(i + "는 4와 5의 공배수");
            }
        }

    }

}
