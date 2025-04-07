package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run r = new Run();
        r.test1();
    }

    public void test1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요: ");
        String input = sc.nextLine();

        CharacterProcess cp = new CharacterProcess();

        try {
            int result = cp.countAlpha(input);
            System.out.println("영문자는 총 " + result + "개입니다.");
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
