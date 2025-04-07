package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {

    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String input = sc.nextLine();

        try {
            CharacterProcess cp = new CharacterProcess();
            int count = cp.countAlpha(input);
            System.out.println("영문자 개수 : " + count);
        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }

    }
    public static void main(String[] args) {
        new Run().test1();
    }
}
