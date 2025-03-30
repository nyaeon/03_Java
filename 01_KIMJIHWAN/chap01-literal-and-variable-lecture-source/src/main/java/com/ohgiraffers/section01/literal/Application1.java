package com.ohgiraffers.section01.literal;

/***
 * Author : 김지환 // summery
 */
public class Application1 {
    /***
     * 메소드의 서머리입니다.
     * @param args
     */
    public static void main(String[] args) {
        // 한줄 주석

        /*
         * 여기도 주석
         * 아래도 주석
         * 여러줄 주석
         */

        System.out.println("Hello World!");

        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');   // 문자의 기본값
//        System.out.println(''); // 아무 문자도 기록되지 않는 경우에도 오류

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true");


    }
}
