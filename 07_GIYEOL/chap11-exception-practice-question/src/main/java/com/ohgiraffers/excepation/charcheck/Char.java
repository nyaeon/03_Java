package com.ohgiraffers.excepation.charcheck;

public class Char extends Exception {
    public Char() {
    }
    public Char(String s) {
    }
        public int countAlpha(String s){
        if(s.indexOf(" ") > -1)
            throw new CharcterProcess("문자 없음");
        int cnt =0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))||Character.isLetter(s.charAt(i)))
                cnt++;
        }
    }
}
