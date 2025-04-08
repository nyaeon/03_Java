package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {
    /***
     * 문자열 s 중에서 영문자 수를 리턴하는 메소드
     * @param s
     * @return
     * @throws CharCheckException
     */
    public int countAlpha (String s) throws CharCheckException {

        if (s.contains(" ")) {
            throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
        }

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                count++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }
}
