package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    Scanner scanner = new Scanner(System.in);

    public void test1() {
        System.out.print("문자열을 입력하세요: ");
        var s = scanner.nextLine();

        try {
            var count = CharacterProcess.countAlpha(s);
            System.out.println("영문자 개수: " + count);
        } catch (CharCheckException e) {
            System.out.println("체크할 문자열 안에 공백을 포함할 수 없습니다.");
        }
    }
}
