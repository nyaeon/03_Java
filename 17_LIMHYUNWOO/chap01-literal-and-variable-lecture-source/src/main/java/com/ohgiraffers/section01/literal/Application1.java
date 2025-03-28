package com.ohgiraffers.section01.literal; // 패키지가 없으면 참조할수가 없다

import java.util.*;  // import를 사용해 외부 클래스 참조

/*** -summary
 *
 */
public class Application1 {
    /***
     * 메소드의 요약기능
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("Hello World");
        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println(123);

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출력
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');;
        // System.out.println('');  아무 문자도 기록되지 않는 경우에도 오류

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");
        System.out.println(""); //문자열에선 공백 허용

        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
        System.out.println("true"); //문자열 ture

    }
}
