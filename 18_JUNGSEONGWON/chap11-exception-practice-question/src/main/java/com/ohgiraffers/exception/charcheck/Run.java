package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class Run {
    public static void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력해주세요.");

        try{
        String s = sc.nextLine();
        CharacterProcess cp = new CharacterProcess();
        cp.countAlpha(s);
        }
        catch (CharCheckException e){
            System.out.println(e.getMessage());
        }

    }
}

