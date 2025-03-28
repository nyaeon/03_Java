package com.ohgiraffers.section01.conditional;

import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import

public class A_if { // 보통 클래스명은 대문자로 시작하는 낙타 표기법(CamelCase)으로 작성 (예: IfExample)

    public void testSimpleIfStatement() { // 메서드 정의
        Scanner sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner 객체 생성

        System.out.println("Enter an Integer: "); // 사용자에게 정수를 입력하도록 요청
        int anInt = sc.nextInt(); // 입력받은 값을 anInt 변수에 저장

        // 입력받은 값이 짝수인지 확인
        if (anInt % 2 == 0) { // 2로 나누었을 때 나머지가 0이면 짝수
            System.out.println("It's even"); // 짝수일 경우 출력
        } else { // 홀수일 경우
            System.out.println("It's odd"); // 홀수일 경우 출력
        }

        sc.close(); // Scanner 객체 닫기 (자원 해제)
    }

    public void testNestedIfStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int input = sc.nextInt();
        if (input > 0 && input % 2 != 0) {
            System.out.println("양수이면서 홀수 입니다.");
        }
    }
}
