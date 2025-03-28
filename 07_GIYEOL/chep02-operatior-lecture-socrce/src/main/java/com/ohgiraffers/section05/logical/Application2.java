package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
    //논리 연산자 활용
    // 1부터 100 사이 값 확인
        int num1 =55;
        System.out.println((num1 >=1)&&(num1 <=100));
        int num2 = 101;
        System.out.println((num2>=1)&&(num2 <=100));
        //영어 대소문자 구분
     char ch1 = 'G';
     char ch2 = 'g';

     System.out.println("A ="+ (int)'A');
     System.out.println(ch1 >= 65 && ch1 <= 90);
     System.out.println(ch2 >= 'A' && ch2 <= 'Z');
    //대소문자 상관없이 대문자 y이여야 함
        char ch3 = 'y';
        char ch4 = 'Y';
        System.out.println("y입력 =" + (ch3 == 'y' || ch3 == 'Y'));
        System.out.println("y입력 =" + (ch4 == 'y' || ch4 == 'Y'));



    }

}
