package com.ohgiraffers.section01.conditional;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import

public class B_Else {

    public void testSimpleIfElseStatement() { // 단순 if-else 문 예제
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성

        System.out.println("Enter an integer"); // 정수 입력 요청
        int input = sc.nextInt(); // 사용자 입력 저장

        // 입력한 정수가 홀수인지 짝수인지 판별
        if (input % 2 != 0) { // 2로 나눈 나머지가 0이 아니면 홀수
            System.out.println("입력하신 정수는 홀수입니다.");
        } else { // 그 외의 경우(짝수)
            System.out.println("입력하신 정수는 짝수입니다.");
        }

        sc.close(); // Scanner 닫기 (자원 해제)
    }

    public void testNestedIfElseStatement() { // 중첩 if-else 문 예제
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer"); // 정수 입력 요청

        int input = sc.nextInt(); // 사용자 입력 저장

        // 정수를 하나 입력받아 양수와 음수를 구분하고, 양수일 때만 짝수인지 판별
        if (input >= 0) { // 입력값이 0 이상이면 양수 또는 0
            if (input % 2 == 0) { // 양수이면서 짝수
                System.out.println("양수이면서 짝수입니다.");
            } else { // 양수이면서 홀수
                System.out.println("양수이면서 홀수입니다.");
            }
        } else { // 음수일 경우
            System.out.println("음수입니다.");
        }

        sc.close(); // Scanner 닫기 (자원 해제)
    }
}
