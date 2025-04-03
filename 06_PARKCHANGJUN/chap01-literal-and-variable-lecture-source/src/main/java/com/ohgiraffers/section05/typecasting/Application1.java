package com.ohgiraffers.section05.typecasting;

public class Application1 {

    public static void main(String[] args) {

        // byte < short < int < long 이기 때문에 다음과 같은 연산 가능. 오른쪽이 크면 불가능.
        byte bNum = 1;

        short sNum = bNum;
        int iNum = sNum;

        int num1 = 10;
        long num2 = 20L;

        long result1 = num1 + num2;
        System.out.println("result1 = " + result1);
        
        int ch1 = 'a';
        System.out.println("ch1 = " + ch1); // 문자형은 int형으로 자동형변환 가능

        char ch2  = 65;



    }
}
