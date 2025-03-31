package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void testSimpleIfElseStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int input = sc.nextInt();

        /*
        * 만약에(홀수라면) {
        *     "입력하신 정수는 홀수입니다"라고 출력
        * } 그밖에 {
        *     "입력하신 정수는 짝수입니다."라고 출력
        * }
        * */
        if(input % 2 != 0) {
            System.out.println("입력하신 정수는 홀수입니다.");
        } else {
            System.out.println("입력하신 정수는 짝수입니다.");
        }

    }

    public void testNestedIfElseStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");

        // 정수를 하나 입력받아 양수와 음수를 구분하고 양수일때만
        // 짝수인지 아닌지 판별
        int input = sc.nextInt();
        if(input >= 0) {
            if(input % 2 == 0) {
                System.out.println("양수이면서 짝수입니다.");
            } else {
                System.out.println("양수이면서 홀수입니다.");
            }
        } else {
            System.out.println("양수가 아닌경우(음수인경우)");
        }

    }
}
