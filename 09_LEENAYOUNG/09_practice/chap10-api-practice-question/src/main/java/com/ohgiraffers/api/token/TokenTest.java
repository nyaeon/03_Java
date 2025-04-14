package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        // 1. "J a v a P r o g r a m" 문자열 값을 공백 단위로 Token 처리하여 char[]에 저장하여 출력
        String str = "J a v a P r o g r a m";
        /*StringTokenizer st = new StringTokenizer(str, " ");
        char[] cArr = new char[st.countTokens()];

        int count = 0;
        while (st.hasMoreTokens()) {
            cArr[count++] = st.nextToken().charAt(0);
        }*/

        String[] sarr = str.split(" ");
        char[] cArr = new char[sarr.length];

        for (int i = 0; i < sarr.length; i++) {
            cArr[i] = sarr[i].charAt(0);
        }

        // 2. 토근 처리 전 글자 및 개수 출력
        System.out.println("토큰 처리 전 문자열 : " + str);
        System.out.println("토큰 처리 전 글자 개수 : " + str.length());

        // 3. 토큰 처리 후 문자배열 개수 출력 확인
        System.out.println("토큰 처리 후 문자 배열 개수 : " + cArr.length);

        // 4. char[] 값 출력
        System.out.println("토큰 처리 후 배열 : " + Arrays.toString(cArr));

        // 5. char[]을 다시 String으로 변환, 모두 대문자로 변환하여 출력
        String result = new String(cArr);
        System.out.println("String 및 대문자로 변환 : " + result.toUpperCase());
    }
}
