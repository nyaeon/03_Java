package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {} // 기본 생성자

    //문자열 s 중에서 영문자가 몇개인지 세는 메소드
    public int countAlpha(String s) throws CharCheckException {
        // 공백 체크
        // if (s.indexOf(" ") > -1) { // 공백 체크 다른 방법.
        // throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.")
        // }
        if(s.contains(" ")) {
            throw new CharCheckException("체크할 문자열 안에 공백 포함할 수 없습니다.");
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // if(Character.isUpperCase(s.charAt(i) || Character.isLowerCase(s.charAt(i)))
            // 함수를 이용한 방법
            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                count++;
            }
        }

        return count;
    }
}
