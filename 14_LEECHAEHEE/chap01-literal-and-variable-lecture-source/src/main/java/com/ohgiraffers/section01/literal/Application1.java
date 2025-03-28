package com.ohgiraffers.section01.literal;

/***
 * Author : dlcogml
 */

public class Application1 {
    public static void main(String[] args) {
        // 한줄 주석
        /*
        여러줄 주석
         */

        // 여러가지 값의 형태를 출력할 수 있다.
        // 정수 형태
        System.out.println(123);

        // 실수 형태
        System.out.println(1.34);

        // 문자 형태
        System.out.println('A');
        System.out.println('1');
        System.out.println('\u0000'); //문자형의 디폴트값
        // System.out.println(''); // 아무 문자도 기록되지 않는 경우 오류

        // 문자열 형태
        System.out.println("Hello world!");
        System.out.println("A"); // 'A' 와 "A"는 다른 자료형

        // 논리 형태
        System.out.println(true);
        System.out.println(false);
    }
}
