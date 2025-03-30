package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_if {

    public void testSimpleIfElseStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요: ");
        int input = sc.nextInt();

        /*
        만약에 (홀수라면) {
            "입력하신 정수는 홀수입니다"라고 출력
            } 그밖에 {
                "입력하신 정수는 짝수입니다"라고 출력
         */

        if (input%2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다");
        } else {
            System.out.println("입력하신 정수는 Wkr수입니다");
        }



    }


    public void testNestedIfElseStatement2() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int input = sc.nextInt();
        if (input>=0) {
            if (input%2 == 0) {
                System.out.println("양수이면서 짝수입니다.");
            } else {
                System.out.println("양수이면서 홀수입니다.");
            }
        } else {
            System.out.println("양수가 아닙니다");
        }
    }
}
