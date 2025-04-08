package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public void test1() {
        CharacterProcess process = new CharacterProcess();
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String input = scanner.nextLine();

        try{
            process.countAlpha(input);
        } catch (CharCheckException c)
        {
            System.out.println(c.getMessage());
        }
    }

    public static void main(String[] args) {
        Run run = new Run();
        run.test1();

    }
}
