package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력 받은 검색할 문자가 문자열에 몇개 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        /* 문자열 클래스에서 제공하는 length(), charAt() */

        //charAt 함수란? String 타입의 데이터(문자열)에서 특정 문자를 char 타입으로 변환할 때 사용하는 함수
        //String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 녀석
        //toCharArray();// 문자 자료형 배열로 바꾼다 -> String 문자열을 char형 배열로 바꿔서 반환해주는 메서드

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();
        //char[] chars = str.charAt();

        System.out.println("검색할 문자 입력하세요 : ");
        char ch = sc.next().charAt(0);

        int count = 0;

        //for (int i = 0; i < chars.length; i++) { // 길이만큼 돌아갈 동안 검색 문자가 같으면 i 증가
        //    if (chars[i] == ch) {
        //        count++;
       //     }
        //}
       // System.out.println("입력하신 문자열 " +  + "에서 찾으시는 문자 " + ch + "는 " + count + "개 입니다.");




    }
}
