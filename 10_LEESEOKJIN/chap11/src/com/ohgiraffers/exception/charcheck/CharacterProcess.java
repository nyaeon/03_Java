package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {
    public static int countAlpha(String s) throws CharCheckException {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i))) {
                throw new CharCheckException();
            }
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
