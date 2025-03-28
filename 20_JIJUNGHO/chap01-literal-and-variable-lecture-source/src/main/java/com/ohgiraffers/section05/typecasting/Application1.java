package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result = " + result1);

        int ch1 = 'a';
        System.out.println(ch1); // 문자형은 int형으로 자동형변환

        char ch2 = 65;
    }
}
