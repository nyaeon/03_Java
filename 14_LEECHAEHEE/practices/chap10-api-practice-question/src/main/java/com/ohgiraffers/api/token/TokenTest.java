package com.ohgiraffers.api.token;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenTest {
    public static void main(String[] args) {
        String str = "J a v a P r o g r a m ";
        System.out.println("str = " + str);
        System.out.println("str의 개수 : " + str.length());
        StringTokenizer st = new StringTokenizer(str, " ");
        char[] chars = new char[st.countTokens()];
        int count = 0;
        while (st.hasMoreTokens()) {
            chars[count++] = st.nextToken().charAt(0);
        }
        System.out.println("chars[] : " + Arrays.toString(chars));
        System.out.println("chars[] 개수 : = " + count);

        String str2 = new String(chars);
        System.out.println("str2 = " + str2.toUpperCase());
    }
}
