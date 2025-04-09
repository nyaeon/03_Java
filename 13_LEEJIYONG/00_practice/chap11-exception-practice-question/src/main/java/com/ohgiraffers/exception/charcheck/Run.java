package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {


    public void test1() {

        System.out.print("문자열을 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        CharacterProcess characterProcess = new CharacterProcess();
        try {
            System.out.println(characterProcess.countAlpha(input));
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Run run = new Run();
        run.test1();

    }
}
