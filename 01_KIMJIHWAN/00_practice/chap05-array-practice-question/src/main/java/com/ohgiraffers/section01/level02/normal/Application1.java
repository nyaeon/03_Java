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
        Scanner sc = new Scanner(System.in);

        // 문자열을 받아서 문자열 크기만큼 배열을 생성해주고 for문을 통해 문자열 하나하나를 charAt[i]로 대입해줌
        System.out.print("문자열을 하나 입력하세요 : ");
        String a = sc.nextLine();
        char[] arrA = new char[a.length()];  // 입력받은 문자열을 문자 자료형 배열로 초기화
        for (int i = 0; i < a.length(); i++) {
            arrA[i] = a.charAt(i);
        }
        // 이렇게도 가능
        // char[] b = a.toCharArray();
        // System.out.println(Arrays.toString(b));

        System.out.print("검색할 문자를 하나 입력하세요 : ");
        char b = sc.next().charAt(0);

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (arrA[i] == b){
                count++;
            }
        }
        System.out.println("입력하신 문자열 " + a + "에서 찾으시는 문자 " + b + "는 " + count + "개 입니다.");

    }
}
