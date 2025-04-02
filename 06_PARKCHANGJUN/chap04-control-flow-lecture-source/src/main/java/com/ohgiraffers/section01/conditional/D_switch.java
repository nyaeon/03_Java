package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {

    public static void testSimpleSwitchStatement() {

        Scanner sc = new Scanner(System.in);

        System.out.print("등급을 입력하세요 (G,S,B): ");
        char grade = sc.next().charAt(0);

        int point = 0;
        boolean flag = true;

        switch (grade) {
            case 'G': point += 11; break;
            case 'S': point += 12; break;
            case 'B': point += 13;
                      break;
            default:
                flag = false;
                System.out.println("똑바로 입력 좀 합시다~~");
        }

        if (flag) {
            System.out.println("당신의 등급은 " + grade + "이며, 현재 포인트는 " + point + "입니다.");
        } else {
            System.out.println("그럼 이참에 회원가입하실까요?");
        }
    }
}

