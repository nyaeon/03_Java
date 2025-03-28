package com.ohgiraffers.section05.lgical;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        // 1. 논리 연산자 결과값 확인
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println();

        System.out.println(true || false);
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println();

        // 2. 논리식에 논리연산자 활용
        int num1 = 10, num2 = 20, num3 = 30, num4 = 40;

        System.out.println((num1<num2) && (num3 < num4));
    }
}
