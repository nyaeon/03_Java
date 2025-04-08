package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {

        Run run = new Run();
        run.test1();
    }

    public void test1() {

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");

        try {
            String str = sc.nextLine();
            CharacterProcess cp = new CharacterProcess();
            int result = cp.countAlpha(str);
            System.out.println("영문자 개수 : " + result);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
