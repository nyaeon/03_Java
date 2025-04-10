package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    public int charSu(String s, char ch) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                cnt++;
            }
        }

        return cnt;
    }
}
