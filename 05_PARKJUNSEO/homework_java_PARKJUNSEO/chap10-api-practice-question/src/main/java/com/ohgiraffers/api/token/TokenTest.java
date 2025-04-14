package com.ohgiraffers.api.token;

import java.util.Arrays;

public class TokenTest {
    public static void main(String[] args) {
        String s = "J a v a P r o g r a m ";
        String[] st = s.trim().split(" ");
        char[] cst = new char[st.length];
        for (int i = 0; i < st.length; i++) {
            cst[i] = st[i].charAt(0);
        }

        System.out.println("토큰 처리전 글자 개수 : " + s.length());
        System.out.println("토큰 처리 후 문자배열 개수 : " + cst.length);
        System.out.println("char[] 값 : " + Arrays.toString(cst));
        String againString = String.valueOf(cst);
        System.out.println("대문자 변환 출력 : " + againString.toUpperCase());


    }
}

