package com.ohgiraffers.section2.looping;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("아무 글자나 입력하세요 : ");
        String str = sc.nextLine();

        if(str == "퇴근") {    // scanner로 입력받은 건 절대 ==로 비교하면 안됨
            System.out.println("퇴근합시다.");
        } else {
            System.out.println("아직 때가 아니야. 기다려줘.");
        }

    }
}
