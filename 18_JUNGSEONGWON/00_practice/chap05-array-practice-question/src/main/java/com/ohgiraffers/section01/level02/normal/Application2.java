package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 스캐너로 입력받아
        System.out.println("주민번호를 입력 해주세요 : ");
        String input = sc.nextLine();
        char[] charArr = input.toCharArray(); // 문자배열로 저장
        if (charArr.length == 14 && charArr[7] =='-'){
            for (int i = 8; i < charArr.length; i++) {
                charArr[i] = '*';
            }
        }
        String output = new String(charArr);
        System.out.println(output);
    }
        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

}
