package com.ohgiraffers.section05.logical;

public class Application_02 {

    public static void main(String[] args) {

        // 논리 연산자 활용하기
        // 1. 1부터 100 사이의 값 확인

        int num1 = 55;
        System.out.println((num1 >= 1) && (num1 <= 100));

        int num2 = 101;
        System.out.println((num2 >= 1) && (num2 <= 100));


        // 2. 영어 대분자 여부 확인 65 - 90
        char ch1 = 'G';
        char ch2 = 'g';

        System.out.println();
        System.out.println("A는 유니코드 번호 몇번? " + (int)'A' + "번");
        System.out.println((ch1 >= 65) && (ch1 <= 90));
        System.out.println((ch2 >= 'A') && (ch2 <= 'Z'));

        // 3. 대솝문자 상관없이 영ㅁ누자 'y' 확인
        char ch3 = 'y';
        char ch4 = 'Y';

        System.out.println();
        System.out.println((ch3 == 'y' || ch3 == 'Y'));
        System.out.println((ch4 == 'y' || ch4 == 'Y'));
    }
}
