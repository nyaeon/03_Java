package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {
        String result = s.substring(0, 1).toUpperCase() + s.substring(1);
        return result;
    }

    public int charSu (String s, char ch) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                result++;
            }
        }
        return result;
    }
}
