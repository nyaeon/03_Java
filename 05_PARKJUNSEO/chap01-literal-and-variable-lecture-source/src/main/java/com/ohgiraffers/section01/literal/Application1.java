package com.ohgiraffers.section01.literal;

/***
 * Author : 박준서
 */
public class Application1 {
    public static void main(String[] args) {
        /***
         * 메소드의 요약 기능을 합니다.
         * @ param args
         */

        // 한 줄 주석

        /*
        * 주석
        * 여러줄 주석
         */

        // 여러 가지 값의 형태를 출력할 수 있다.
        // 정수 형태의 값 출력
        System.out.println("Hello World!");

        // 실수 형태의 값 출력
        System.out.println(1.234);

        // 문자 형태의 값 출려
        System.out.println('a');
        System.out.println('1');
        System.out.println('\u0000');   // 유니코드 null 문자의 원래 형태?
        //System.out.println('');       // 띄어쓰기도 없는 그냥 공백은 출력 불가

        // 문자열 형태의 값 출력
        System.out.println("안녕하세요");
        System.out.println("a");        // 문자 a랑 문자열 a는 다른 것임. 출력은 같지만 자료형의 값 입장에서 보면 엄연히 다름
        System.out.println("");         // 문자열은 그냥 공백 출력 가능
        System.out.println("true");     // 얘도 문자열
        
        // 논리 형태의 값 출력
        System.out.println(true);
        System.out.println(false);
    }
}