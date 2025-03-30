package com.ojgiraffers.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public static void testSimpleStiwchStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.println("등급을 입력하세요 (G,S,B): ");
        char grade = sc.next().charAt(0);

        int point = 0;
        boolean flag = true;

        switch (grade) {
            case 'G':  point +=13; break;
            case 'S':  point += 12; break;
            case 'B':  point += 11; break;
            default:
                flag = false;
                System.out.println("똑바로 입력해 임마~~");
        }

        if(flag){
            System.out.println("당신의 등급은 "+ grade + "이며, 현재 포인트는 "+ point + "입니다.");
        } else{
            System.out.println("그럼 이참에 회원가입하실까요?");
        }
    }
}
