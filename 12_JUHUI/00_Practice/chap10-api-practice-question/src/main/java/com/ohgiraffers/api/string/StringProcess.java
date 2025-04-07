package com.ohgiraffers.api.string;

import java.util.Scanner;

public class StringProcess {

    public String preChar(String s) {
        Scanner sc = new Scanner(s);
        char first = sc.nextLine().charAt(0);
        first = Character.toUpperCase(first);// wrapper클래스 사용해 인스턴스화해 사용

        System.out.println("첫글자 대문자 변환 : " + first);
        return String.valueOf(first);
    }

    public int charSu(String s, char ch) {
        Scanner sc = new Scanner(s);
        int count = 0;

        String str = sc.nextLine(); // 문자열 입력받아 변수에 저장
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("찾는 문자는 총 " + count + "개 입니다.");

        return count;
    }
}
