package com.ohgiraffers.section01.literal;

public class Application1 {
    /***
     * Autor : ~ 최초 작성자
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
            //한 줄 주석

        /*
         여러줄 주석
         */
        /***
         *  메소드의 요약기능을 합니다.
         */
        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000'); // 문자열의 기본형태
        // System.out.println(''); // 아무 문자도 기록되지 않은 경우에는 오류

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a"); // 문자 'a'와 문자열 "a"는 다른 값이다
        System.out.println(""); // 문자열 공백은 허용이 가능하다.

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true"); // 문자열 true로 출력은 같지만 리터럴 값은 다르다










    }
}
