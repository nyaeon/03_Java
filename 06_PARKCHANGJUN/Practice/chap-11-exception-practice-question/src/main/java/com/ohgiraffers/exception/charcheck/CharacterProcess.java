package com.ohgiraffers.exception.charcheck;

import com.ohgiraffers.exception.charcheck.run.CharacterProcess;

// 클래스명
public class CharacterProcess {

    // 기본 생성자 생성
    public CharacterProcess() {
    }

    /**
     * 문자열 s 중에서 알파벳 수를 리턴하는 메소드
     *
     * @param s
     * @return
     * @throws CharCheckException
     */

    public int countAlpha(String s) throws CharCheckException {

        if (s.indexOf(" ") > -1) {// 공백이 있는 경우
            throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
        }
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)) || Character.isLowerCase(s.charAt(i))) {
                cnt++;

            }
        }
    }
}


/**
        public int countAlpha(String s) throws CharacterProcess {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isAlphabetic(c)) {
                    count++;
                }
                else if (Character.isWhitespace(c)) {
                    throw new CharacterProcess("문자열을 입력하세요 : ");
                }
            }
            return count;
        }
*/