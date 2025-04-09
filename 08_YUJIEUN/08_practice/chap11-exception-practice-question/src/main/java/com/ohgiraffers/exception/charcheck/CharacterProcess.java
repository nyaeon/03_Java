package com.ohgiraffers.exception.charcheck;

public class CharacterProcess {

    public void countAlpha(String s) throws CharCheckException {
        // 문자열에 공백이 포함되어 있는지 확인
        if (s.contains(" ")) {
            throw new CharCheckException("공백은 포함할 수 없습니다.");
        }

        int count = 0; // 알파벳 개수 카운트

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isAlphabetic(ch)) {
                System.out.println(ch + " 는 알파벳입니다.");
                count++;
            } else {
                System.out.println(ch + " 는 알파벳이 아닙니다.");
            }
        }

        System.out.println("총 알파벳 개수는: " + count + "개입니다.");
    }
}
