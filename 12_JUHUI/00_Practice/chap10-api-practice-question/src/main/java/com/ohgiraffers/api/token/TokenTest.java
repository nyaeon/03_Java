package com.ohgiraffers.api.token;

import java.util.StringTokenizer;

public class TokenTest {

    public static void main(String[] args) {

        String str = "J a v a P r o g r a m ";

        // 1. 토큰 처리 전 글자 및 개수 출력
        System.out.println("토큰 처리 전 문자열: " + str);
        System.out.println("토큰 처리 전 문자열 길이: " + str.length());

        // StringTokenizer를 사용하여 공백으로 구분
        StringTokenizer tokenizer = new StringTokenizer(str, " ");

        // 토큰 개수 확인
        int tokenCount = tokenizer.countTokens();
        System.out.println("토큰 처리 후 문자 개수: " + tokenCount);

        // 2. 토큰을 char[] 배열에 저장
        char[] charArray = new char[tokenCount];
        int index = 0;

        // 토큰을 순회하면서 char 배열에 저장
        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            charArray[index] = token.charAt(0); // 각 토큰의 첫 번째 문자만 저장
            index++;
        }

        // 3. char[] 배열 출력
        System.out.print("char[] 값: ");
        for(char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 4. char[]을 다시 String으로 변환 후 대문자로 출력
        String result = new String(charArray);
        System.out.println("대문자 변환 결과: " + result.toUpperCase());
    }
}
