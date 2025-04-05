package com.ohgiraffers.section03.branch;

public class A_break {
    public String testReturnStatement() {

        for (int i = 0; i < 3; i++) {
            if(i == 1) {
                System.out.println("출력완료");
                break;
            }
            System.out.println("for문 출력");
        }
        System.out.println("메소드 끝");
        return "Hello";
    }
}
