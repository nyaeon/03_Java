package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        //byte < short < int < long
        byte bNUM = 10;

        short sNUM = 20;
        int iNum = sNUM;

        int num1 = 10;
        long num2 = 10;

        long result = num1 + num2;
        System.out.println("result = " + result);

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1); // 문자형은 int형으로 자동 형 변환

        char ch2 = 65;
        System.out.println("ch2 = " + ch2);
    }
}
