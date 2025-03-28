package com.ohgiraffers.section04.comparsion;

public class Application1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 10;

        /* 1. 1부터 100 사이의 값인지 확인 */
        /* 1 <= 변수 <= 100 이렇게는 사용 못함  --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다. */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

        /* 2. 영어 대문자인지 확인 */
        /* 영어 대문자냐? --> 문자변수 >= 'A' && 문자변수 <= 'Z' */
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        /* 문자변수 == 'y' || 문자변수 == 'Y' */
        char ch3 = 'Y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));

        char ch4 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y'));

        /* 4. 영문자인지 확인 */
        /* A : 65, Z : 90, a : 97, z : 122 (중간에 91 ~ 96까지는 영문자가 아님) */
        /* 연산자 우선순위를 고려한다면 논리 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 된다.
         * 논리적으로 먼저 실행하는 내용을 괄호로 묶어 주는게 좋다.
         * */
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >= 97 && ch6 <= 122)));
    }
}

