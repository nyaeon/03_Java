package com.ohgiraffers.section01.literal;

/*
 * Author : 지정호
 * */

public class Application1 {
    /***
     * 메소드의 요약기능
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 여러가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
//        System.out.println('');

        // 문자열 형태의 값 출력 "" 사용
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        // 해당 값은 문자열이라 논리 형태가 아니다.
        System.out.println("false");
    }
}
