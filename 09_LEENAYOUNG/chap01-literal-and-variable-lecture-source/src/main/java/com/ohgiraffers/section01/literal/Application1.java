package com.ohgiraffers.section01.literal;

/***
 * Author : 이나영
 */
public class Application1 {

    /***
     * 메소드의 요약 기능을 합니다.
     * @param args
     */
    // 한줄 주석
    /*
    * 여러줄 주석
    * */
    public static void main(String[] args) {

        System.out.println("Hello World!");

        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');
        //System.out.println(''); // 아무 문자도 기록되지않는 경우에도 오류

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println("");

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
    }
}
