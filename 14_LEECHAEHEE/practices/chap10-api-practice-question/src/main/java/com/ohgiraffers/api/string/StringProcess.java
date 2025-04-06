package com.ohgiraffers.api.string;

public class StringProcess {
    public StringProcess() {}

    public String preChar(String s) {
        String s2 = s.substring(0, 1).toUpperCase();
        return s2 + s.substring(1);
    }
    public int charSu(String s, char ch) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
