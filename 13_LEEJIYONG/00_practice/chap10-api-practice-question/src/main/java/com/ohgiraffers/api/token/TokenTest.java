package com.ohgiraffers.api.token;

import java.util.Arrays;

public class TokenTest {

    public static void main(String[] args) {
        String s = "J a v a P r o g r a m ";
        System.out.println(s);
        System.out.println(s.length());

        String[] splitS = s.split(" ");
        System.out.println(splitS.length);

        char[] chars = new char[splitS.length];
        for (int i = 0; i < splitS.length; i++) {
            chars[i] = splitS[i].charAt(0);
        }
        System.out.println(Arrays.toString(chars));

        String result = "";
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
        }

        System.out.println(result);
    }

}
