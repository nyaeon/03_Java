package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Test {
    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("아무 글자 입력:");
        String str = sc.nextLine();
        if (str.equals("퇴근")) {
            System.out.print("퇴근 ㄱㄱ");
        } else {
            System.out.print("야근 ㄱㄱ");
        }
    }
}