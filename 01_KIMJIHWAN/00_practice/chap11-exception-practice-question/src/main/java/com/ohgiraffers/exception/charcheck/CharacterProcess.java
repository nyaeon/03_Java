package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public int countAlpha(String s) throws CharCheckException {
        int count = 0;

        if (s.indexOf (" ") > -1) {
            throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
        }

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}