package com.ohgiraffers.api.token;

import java.util.Arrays;

public class TokenTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";

        System.out.println("토큰 처리 전 문자열: " + str);
        System.out.println("토큰 처리 전 문자 개수: " + str.length() + "개");

        String[] token = str.split(" ");
        System.out.println("토큰 처리 후 문자배열 갯수 : " + token.length);

        char[] chArr = new char[token.length];
        for (int i = 0; i < token.length; i++) {
            chArr[i] = token[i].charAt(0);
        }

        System.out.println("char[] 값 : " + Arrays.toString(chArr));

        String result = new String(chArr).toUpperCase();
        System.out.println(result);

    }

}
