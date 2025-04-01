package com.ohgiraffers.section04.overflow;

import org.w3c.dom.ls.LSOutput;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("byte 값의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char 값의 범위 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
        System.out.println("short 값의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 값의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 값의 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float 값의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 값의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);


        System.out.println("=================================================================================");

        byte num1 = 127;
        System.out.println("num1 : " + num1);						      //127 : byte의 최대 저장 범위

        num1++;														                    //1 증가
        System.out.println("num1 overflow : " + num1);				//-128 : byte의 최소 저장 범위


        // 언더플로우
        // 오버플로우와 반대로 흘러가는 현상


        byte num2 = -128;
        System.out.println("num2 : " + num2);						      //-128 : byte의 최소 저장 범위

        num2--;														                    //1 감소
        System.out.println("num2 underflow : " + num2);				//127 : byte의 최대 저장 범위




        int firstNum = 1000000;			//100만
        int secondNum = 700000;			//70만

        int multi = firstNum * secondNum;		//7천억이 나와야 함

        System.out.println("multi = " + multi);			//--79669248 이 나온다. -> 실행중 오류 (런타임 에러)

        //강제형변환
        long result = (long) firstNum * secondNum; // 작은자료형은 큰 자료형을 따라간다.
        System.out.println("result = " + result);



    }



}
