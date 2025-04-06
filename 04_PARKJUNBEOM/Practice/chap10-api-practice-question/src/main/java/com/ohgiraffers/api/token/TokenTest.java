package com.ohgiraffers.api.token;

public class TokenTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";
        String[] chars = str.split(" ");
        char[] result = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            result[i] = chars[i].charAt(0);  // 각 문자열의 첫 글자를 char로 변환
        }
    }
}
