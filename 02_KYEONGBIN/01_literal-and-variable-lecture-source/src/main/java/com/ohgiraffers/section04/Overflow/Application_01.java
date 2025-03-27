package com.ohgiraffers.section04.Overflow;

public class Application_01 {
    public static void main(String[] args) {

        // 각 자료형의 최소값과 최대값 출력
        System.out.println("byte 값의 범위 : " + Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE);
        System.out.println("char 값의 범위 : " + (int) Character.MIN_VALUE + " ~ " + (int) Character.MAX_VALUE);
        System.out.println("short 값의 범위 : " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
        System.out.println("int 값의 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
        System.out.println("long 값의 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float 값의 범위 : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double 값의 범위 : " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);

        System.out.println("-------------------");

        // 오버플로우 테스트
        byte num1 = 126;
        num1++; // 127
        System.out.println("num1 = " + num1);

        num1++; // byte 최대값(127) 초과 → 최소값(-128)로 변경 (오버플로우 발생)
        System.out.println("num1 = " + num1);

        // 언더플로우 테스트
        num1--; // -129 → 127로 변경 (언더플로우 발생)
        System.out.println("num1 = " + num1);

        num1--; // 126
        System.out.println("num1 = " + num1);

        System.out.println("-------------------");

        // 정수 오버플로우 발생 예제
        int firstNum = 1_000_000;  // 가독성을 위한 언더스코어 사용
        int secondNum = 700_000;   // 70만

        int multi = firstNum * secondNum; // int 범위를 초과하여 오버플로우 발생
        System.out.println("multi = " + multi);

        // 형변환을 이용한 오버플로우 방지
        long longMulti = (long) firstNum * secondNum; // 하나라도 long 타입이면 결과도 long
        System.out.println("longMulti = " + longMulti);
    }
}
