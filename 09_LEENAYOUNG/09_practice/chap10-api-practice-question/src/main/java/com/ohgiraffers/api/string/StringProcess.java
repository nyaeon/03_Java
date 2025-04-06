package com.ohgiraffers.api.string;

public class StringProcess {

    public String preChar(String s) {
        // 문자열을 넘겨받아, 첫글자를 대문자로 바꾸는 메서드 작성
        String first = s.substring(0, 1);
        first = first.toUpperCase();
        first = first.concat(s.substring(1));
        return first;
    }

    public int charSu(String s, char ch) {
        // 문자열에서 찾는 문자가 몇개 포함되어 있는지 반환하는 메서드 작성
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
}
