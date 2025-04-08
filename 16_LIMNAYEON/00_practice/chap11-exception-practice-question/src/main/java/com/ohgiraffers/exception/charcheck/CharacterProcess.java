package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public CharacterProcess() {
    }

    /***
     * 문자열 s 중에서 알파벳 수를 리턴하는 메소드
     * @param s
     * @return
     * @throws CharCheckException
     */
    public int countAlpha(String s) throws CharCheckException{

//        if(s.indexOf(" ") > -1){
//            throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
//        }

        if(s.contains(" ")) {
            throw new CharCheckException("체크할 문자열 안에 공백을 포함할 수 없습니다.");
        }

        int count = 0;

//        for(int i = 0; i < s.length(); i++) {
//            if(Character.isUpperCase(s.charAt(i))) || Character.isLowerCase(s.charAt(i)) {
//                count++;
//            }
//        }
//        return count;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
                count++;
            }
        }
        return count;
    }
}
