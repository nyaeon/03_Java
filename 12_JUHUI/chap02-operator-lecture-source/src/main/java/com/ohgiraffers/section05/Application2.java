package com.ohgiraffers.section05;

public class Application2 {
    public static void main(String[] args) {

        // 논리 연산자 활용하기
        // 1. 1부터 100 사이의 값을 확인
        int num1 = 55;
        System.out.println((num1 >= 1) && (num1 <= 100));
        int num2 = 101;
        System.out.println((num2 >= 1) && (num2 <= 100));

        // 2. 영어 대문자인지 확인
        char ch1 = 'G';
        char ch2 = 'g';

        System.out.println("A는 유니코드 몇 번? " + (int)'A');
        System.out.println(ch1 >= 65 && ch1 <= 90);
        System.out.println(ch2 >= 'A' && ch2 <= 'Z');

        // 3. 대소문자 상관없이 영문자 'Y' 확인
        char ch3 = 'Y';
        char ch4 = 'y';

        System.out.println("y를 입력했는지 확인 : " + (ch3 == 'Y' || ch4 == 'y'));
        System.out.println("y를 입력했는지 확인 : " + (ch3 == 'Y' || ch4 == 'y'));
    }
}
