package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {


        // btye < short < int < long
        byte bNum = 1;
        short sNum = bNum;
        int iNum = sNum;

        int ch1 = 'a';
        System.out.println("ch1 = " + ch1);
    }
}


