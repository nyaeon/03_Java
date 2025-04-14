package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public int countAlpha(String s) throws CharCheckException {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
            }

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                cnt++;
            }
        }

        return cnt;
    }

}
