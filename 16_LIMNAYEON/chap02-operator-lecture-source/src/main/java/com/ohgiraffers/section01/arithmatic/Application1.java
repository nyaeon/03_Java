package com.ohgiraffers.section01.arithmatic;

public class Application1 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("num1 + num2 = " + (num1 + num2));;
        System.out.println("num1 + num2 = " + (num1 - num2));;
        System.out.println("num1 + num2 = " + (num1 * num2));;

        double testNum = num1 / (double) num2;
        System.out.println("testNum = " + testNum);
        
        double resultNum = (int) (testNum * 1000) / (double) 1000;
        System.out.println("resultNum = " + resultNum);

        System.out.println("num1 % num2 = " + (num1 % num2));;
    }
}
