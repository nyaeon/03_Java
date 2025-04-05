package com.ohgiraffers.section04.overflow;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("byte 값의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char 값의 범위 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE);
        System.out.println("short 값의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 값의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 값의 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float 값의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 값의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

        System.out.println("==================================================================================");

        byte num1 = 127;

        num1++; // 후위 증감 연산자 : 기존의 num1변수에 있던 갓에 1을 더해 다시 대입

        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        num1++;
        System.out.println("num1 = " + num1);

        // 언더플로우
        // 오버플로우의 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우
        num1--;
        System.out.println("num1 = " + num1);

        num1--;
        System.out.println("num1 = " + num1);

        num1--;
        System.out.println("num1 = " + num1);

        int firstNum = 10000000;
        int secondNum = 70000000;

        int multi = firstNum * secondNum; // 7천억
        System.out.println("multi = " + multi);

        long longMulti = firstNum * secondNum;
        System.out.println("longMulti = " + longMulti);

        // 강제 형변환
        long reuslt = (long) firstNum * secondNum; // 작은자료형은 큰 자료형을 따라간다.
        System.out.println("reuslt = " + reuslt);
    }
}
