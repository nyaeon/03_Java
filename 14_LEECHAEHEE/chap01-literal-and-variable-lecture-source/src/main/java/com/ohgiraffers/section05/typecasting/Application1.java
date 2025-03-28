package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* 1. 정수끼리의 자동 형변환 */
        /* 점점 더 큰 자료형으로 데이터를 옮겨도 문제 없이 자동 형변환 처리 된다. */
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        /* 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산한다. */
        int num1 = 10;
        long num2 = 20;
        //int result1 = num1 + num2;		//자동으로 큰 쪽 자료형인 long으로 변경 후 계산하기 때문에 int형 변수에 값을 담을 수 없다.
        long result1 = num1 + num2;			//int + long은 서로 다른 자료형이라 데이터 손실이 발생하지 않는 int-> long 변환을 자동 수행 후 연산한다.

        System.out.println("result1 : " + result1);

        /* 2. 실수 끼리의 자동 형변환 */
        float fnum = 4.0f;
        double dnum = fnum;

        /* 연산 시에도 자동으로 큰 쪽 자료형에 맞춰서 계산된다. */
        double result2 = fnum + dnum;

        System.out.println("result2 : " + result2);
    }
}
