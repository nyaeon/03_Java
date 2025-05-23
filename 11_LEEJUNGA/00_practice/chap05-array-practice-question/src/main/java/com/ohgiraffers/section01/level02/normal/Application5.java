package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가
         * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
         * 인덱스를 출력하세요.
         *
         * ex.
         *	문자열 : application
         *	문자 : i
         *	application에 i가 존재하는 위치(인덱스) : 4 8
         *	i 개수 : 2
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 : ");
        String str = sc.nextLine();

        System.out.print("문자열 : ");
        char ch = sc.nextLine().charAt(0);

        // 배열
        char[] chars = str.toCharArray();

        String msg = str + "에 " + ch + "가 존재하는 위치(인덱스) : ";
        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch) {
                msg += (i + " ");
                cnt++;
            }
        }

        System.out.println(msg);
        System.out.println(ch + " 개수 : " + cnt);
    }
}
