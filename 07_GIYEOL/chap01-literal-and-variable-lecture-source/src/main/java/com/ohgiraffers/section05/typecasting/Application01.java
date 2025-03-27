package com.ohgiraffers.section05.typecasting;

public class Application01 {
    public static void main(final String[] args) {
//        byte bNum =1;
//        short sNum = bNum;
//        int iNum =sNum;
        int  num1 = 10;
        long num2 = 20;
        long result = num1 + num2;
        System.out.println("result = " +  result);

        int ch1 ='a';
        System.out.println("ch1 = " + ch1); //문자형은 int형으로 자동형 변환 가능

        char ch2 =65;
        System.out.println("ch2 = " + ch2);




    }
}
