package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
    }
    public int countAlpha(String s) throws CharCheckException {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);
            if ((alpha >= 'a' && alpha <= 'z') | (alpha >= 'A' && alpha <= 'Z')) {
                count += 1;
            } else if (alpha == 32) {
                throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
            } else {
                count += 0;
            }
        } return count;
    }







}
