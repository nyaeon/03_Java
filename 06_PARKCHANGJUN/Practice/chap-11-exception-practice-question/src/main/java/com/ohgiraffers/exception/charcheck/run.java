package com.ohgiraffers.exception.charcheck;

import java.util.Scanner;

public class run {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");

        String s = sc.nextLine();
        CharCheckException cp = new CharCheckException();
        cp.countAlpha(s);

    }
    }

