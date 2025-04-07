package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public int countAlpha(String s) throws CharCheckException {

        if (s.contains(" ")) {
            throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
        }

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }

        return count;
    }
}
