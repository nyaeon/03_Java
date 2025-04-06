package com.ohgiraffers.api.token;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        //    - 요구사항
        //    1. `"J a v a P r o g r a m "` 문자열 값을 공백 단위로 Token 처리하여 `char[]` 에 저장하여 출력하시오.
        //    2. 토큰 처리전 글자 및 개수 출력
        //    3. 토큰 처리 후 문자배열 갯수 출력 확인
        //    4. `char[]` 값 출력
        //    5. `char[]` 을 다시 `String` 으로 변환, 모두 대문자로 변환하여 출력

        String str = "J a v a P r o g r a m ";
        System.out.println("글자 출력 : " + str);
        System.out.println("개수 출력 : " + str.length());

        StringTokenizer st = new StringTokenizer(str, " ");
        char[] chars = new char[st.countTokens()];

        int i = 0;
        while(st.hasMoreTokens()) {
            chars[i++] = st.nextToken().charAt(0);
        }
        System.out.println("char Array 출력 : " + Arrays.toString(chars));

        str = String.valueOf(chars);
        System.out.println("스트링 변환, 대문자 변환 후 출력 : " + str.toUpperCase());
    }
}
