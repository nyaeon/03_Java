package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아무 글자나 입력하세요 : ");
        String str = sc.nextLine();

        if (str.equals("퇴근")) { // Scanner로 입력받은 문자열은 == 비교 불가능!
            System.out.println("퇴근하겠습니다");
        } else {
            System.out.println("으흠~~ 아직 때가 아니야... 기다려...");
        }
    }

}
