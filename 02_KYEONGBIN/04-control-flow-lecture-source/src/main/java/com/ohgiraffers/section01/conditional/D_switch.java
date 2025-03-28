package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public static void testSimpleSwitchStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("등급을 입력하세요! (G, S, B): ");

        char grade = sc.next().charAt(0);

        int point = 0;
        boolean flag = true;

        switch (grade) {
            case 'G' : point += 30; break;
            case 'S' : point += 20; break;
            case 'B' : point += 10; break;
            default:
                flag = false;
                System.out.println("똑바로 입력좀 합시다~~ (G, S, B 중에서 입력하세요!)");
        }

        if (flag) {
            System.out.println("당신의 등급은: " + grade + "이며 포인트는 " + point + "점 입니다.");
        } else {
            System.out.println("그럼 이참에 회원가입 하실까요?");
        }

        sc.close(); // Scanner 닫기 (자원 해제)
    }

    public static void main(String[] args) {
        testSimpleSwitchStatement(); // 메서드 실행
    }
}
