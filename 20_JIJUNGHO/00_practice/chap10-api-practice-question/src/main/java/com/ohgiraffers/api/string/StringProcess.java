package com.ohgiraffers.api.string;

public class StringProcess {


    public String preChar(String s) {
        String ch = s.substring(0, 1);
        ch = ch.toUpperCase();
        ch = ch.concat(s.substring(1));

        return ch;
    }

    public int charSu(String s, char ch) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'c') {
                count++;
            }
        }

        return count;
    }
}
