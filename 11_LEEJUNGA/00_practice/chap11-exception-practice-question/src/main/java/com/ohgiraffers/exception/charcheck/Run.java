package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void main(String[] args){
        Run run = new Run();
        run.test1();
    }
    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        CharacterProcess cp = new CharacterProcess();
        try {
            int cnt = cp.countAlpha(sc.nextLine());
            System.out.println("co 문자열 수 : " + cnt + "개");

        } catch (CharCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
