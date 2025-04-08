package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        Run run = new Run();
        run.test1();
    }

    public void test1 () {
        Scanner sc = new Scanner(System.in);
        CharacterProcess cp = new CharacterProcess();
        System.out.print("문자열 입력 : ");
        String input = sc.next();

        try {
            cp.countAlpha(input);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }

    }

}
