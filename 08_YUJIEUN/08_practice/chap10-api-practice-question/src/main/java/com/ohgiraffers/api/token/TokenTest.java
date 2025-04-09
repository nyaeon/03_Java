package com.ohgiraffers.api.token;

import java.sql.SQLOutput;

public class TokenTest {

    public static void main(String[] args) {

        String input = "Java Programming";

        // 1. 토큰 처리 전 글자 및 개수 출력
        System.out.println(input);
        System.out.println("글자 수 :" + input.length());

        //2. 문자열 값을 공백 기준으로 자르기(토큰 처리)
        String[]  tokens = input.split(" ");

        //3. 토큰 처리 후 단어 수 출력
        System.out.println("\n ==== 토큰 처리 후 단어 수 ======");
        System.out.println("단어 수 :" + tokens.length);

        //4. 각 토큰을 char[] 로 바꿔 출력
        System.out.println("\n ====== 각 토큰을 char[] 로 바꿔 출력 ======= ");

        for (String token : tokens) {
            char[] chars = token.toCharArray();
            System.out.println("["+token+"] ");
            for(char ch : chars){
                System.out.print(ch+" ");
            }
            System.out.println();
        }

        // 5. 모든 토큰을 하나의 char[]로 합치고 대문자로 변환한 뒤 출력
        System.out.println("\n ==== 문자열 합치고 대문자로 변환 ===");
        String com = String.join(" ", tokens);
        String upper = com.toUpperCase();
        System.out.println(upper);


        // 6. 대문자 문자열을 char[]로 변환 후 출력
        System.out.println("\n======== 대문자 문자열을 char[]로 변환 후 출력 =====");
        char[] chars = upper.toCharArray();
        System.out.println("["+upper+"] ");
        for(char ch : chars){
            System.out.print(ch+" ");
        }
        System.out.println();

    }

}
