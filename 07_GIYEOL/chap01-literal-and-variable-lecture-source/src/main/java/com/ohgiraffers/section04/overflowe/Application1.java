package com.ohgiraffers.section04.overflowe;

public class Application1 {
    public static void main (String[] args) {
        System.out.println("byte 값의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char 값의 범위 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
        System.out.println("short 값의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 값의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 값의 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float 값의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 값의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);



    System.out.println("=====================================================================");

    byte num1 =126;
    num1++;  //후의 연산자 : 기존 num1 변수에 있던 값에 1을 더해 다시 대입
    System.out.println("num1 = " + num1);
    num1++;
    System.out.println("num1 = " + num1);
    num1++;
    System.out.println("num1 = " + num1);
        ++num1;  //전위 연산자

// underflow
// 오버플로우와 반대로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상
        num1--;
        System.out.println("num1 = " + num1);
        num1--;
        System.out.println("num1 = " + num1);
        num1--;
        System.out.println("num1 = " + num1);

        int firstnum = 100000;
        int secondnum = 70000;

        int mulit = firstnum * secondnum; //7천억
    System.out.println("mulit = " + mulit); //오버플로우 발생

        long longmulit = firstnum * secondnum;
        System.out.println("longmulit = " + longmulit); //변수명이 int로 선언되어있어 오버플로우 발생
    //강제 형변환
        long result = (long)firstnum * secondnum; //작은 자료형은 큰 자료형을 따라간다
        System.out.println("result = " + result);


    }
}
