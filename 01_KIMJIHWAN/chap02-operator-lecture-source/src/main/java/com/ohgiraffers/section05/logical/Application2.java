package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {

        // 논리 연사자 활용하기
        // 1. 1부터 100 사이 값 확인
        int num1 = 55;
        System.out.println((1 <= num1) && (num1 <= 100));
        int num2 = 101;
        System.out.println((num2 >= 1) && (num2 <= 100));

        // 2. 영어 대문자인 확인
        char ch1 = 'G';
        char ch2 = 'g';

        System.out.println("A는 유니코드 번호 몇번? : " + (int) 'A');
        System.out.println(ch1 >= 65 && ch1 <= 90);
        System.out.println(ch1 >= 'A' && ch1 <= 'Z');

        // 3. 대소문자 상관없이 영문자 'y' 확인
        char ch3 = 'Y';
        char ch4 = 'Y';

        System.out.println("Y를 입력 했는지 확인 : " + ((ch3 == 'y') || (ch3 == 'Y')));




    }
}
