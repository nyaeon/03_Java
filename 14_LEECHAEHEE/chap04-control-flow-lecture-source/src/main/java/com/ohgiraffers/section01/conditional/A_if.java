package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한개를 입력하세요: ");
        int input = sc.nextInt();

        // 입력 받은 값이 짝수면 '짝수입니다' 출력
        if (input % 2 == 0) {
            System.out.println("짝수입니다");
        }
        if (input % 2 != 0) {
            System.out.println("홀수입니다");
        }
    }
}
