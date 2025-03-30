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

        /*
        byte 값의 범위 : -128 ~ 127
        char 값의 범위 : 0 ~ 65535
        short 값의 범위 : -32768 ~ 32767
        int 값의 범위 : -2147483648 ~ 2147483647
        long 값의 범위 : -9223372036854775808 ~ 9223372036854775807
        float 값의 범위 : 1.4E-45 ~ 3.4028235E38
        double 값의 범위 : 4.9E-324 ~ 1.7976931348623157E308
         */
        byte num1 = 127;
        System.out.println("num1 : " + num1);						      //127 : byte의 최대 저장 범위

        num1++;														                    //1 증가
        System.out.println("num1 overflow : " + num1);				//-128 : byte의 최소 저장 범위
    }
}
