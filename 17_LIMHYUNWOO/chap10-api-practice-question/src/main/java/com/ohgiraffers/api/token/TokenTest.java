package com.ohgiraffers.api.token;

public class TokenTest {
    public static void main(String[] args) {
        char[] chars = {'J',' ','a',' ','v',' ','a',' ','P',' ','r',' ','o',' ','g',' ','r',' ','a',' ','m'};
        System.out.println("토큰 처리전 글자 및 개수 출력");
        System.out.println(chars);
        System.out.println(chars.length);

        int cnt = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == ' '){
                continue;
            }
            cnt++;
        }
        char[] newChars = new char[cnt];
        int j = 0;
        for(int i=0;i<chars.length;i++) {
            if(chars[i]!=' ') {
                newChars[j++] = chars[i];
            }
        }
        System.out.println("토큰 처리 후 문자배열 갯수 출력 확인");
        System.out.println(newChars);
        System.out.println(newChars.length);

        System.out.println("모두 대문자 변환");
        String str = new String(newChars);
        str = str.toUpperCase();
        System.out.println(str.toString());
    }
}
