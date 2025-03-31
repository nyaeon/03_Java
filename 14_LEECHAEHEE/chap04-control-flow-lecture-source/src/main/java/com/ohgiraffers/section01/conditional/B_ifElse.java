package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void testSimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = sc.nextInt();

        // 짝수인가 홀수인가
//      if (input % 2 == 0) {
//            System.out.println("입력하신 정수는 짝수입니다.");
//        } else {
//            System.out.println("입력하신 정수는 홀수입니다.");
//        }

        // 먼저 양수인지 음수인지 구분하고 양수일때만 홀수 짝수 판별
        if (input >= 0) {
            if (input % 2 == 0) {
                System.out.println("양수이면서 짝수입니다.");
            } else {
                System.out.println("양수이면서 홀수입니다.");
            }
        } else {
            System.out.println("음수입니다.");
        }

    }
}
