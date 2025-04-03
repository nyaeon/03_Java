package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {


        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("주민등록번호를 입력하세요 : ");
        String input = scanner.nextLine();
        System.out.println(input);

        input.toCharArray(); // 입력받은 문자열을 문자로 잘라서 문자배열에 담아주는 기능
        // charAt();

        char[] cArr = new char[input.length()];
        for(int i = 0; i < input.length(); i++) {
            cArr[i] = input.charAt(i);
        }

        System.out.println(Arrays.toString(cArr));

        System.out.println(Arrays.toString(input.toCharArray()));




    }
}
