package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("==============================================================");

        byte num1 =126;

        num1++;  // 후위증감연산자 : 기존의 num1 변수에 있던 값에 1을 더해 다시 대입
        System.out.println("num1 = " + num1);
        // Overflow  최대 범위보다 큰수를 발생시키는 현상
        num1++;
        System.out.println("num1 = " + num1);
        // Underflow  최소 범위보다 작은수를 발생시키는 경우 발생하는 현상
        num1--;
        System.out.println("num1 = " + num1);

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum; // 7000억
        System.out.println("multi = " + multi);

        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);
        
        // 강제형변환
        long result = (long) firstNum * secondNum; // 작은 자료형은 큰 자료형을 따라간다.
        System.out.println("result = " + result);
    }
}
