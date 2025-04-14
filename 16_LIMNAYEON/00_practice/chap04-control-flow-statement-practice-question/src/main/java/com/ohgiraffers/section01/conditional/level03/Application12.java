package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application12 {

    public static void main(String[] args) {

        /*
            정수 입력 : 4
            ****
            ***
            **
            *
            정수 하나를 입력받아서 위와 같은 모양의 삼각형을 출력하세요
       */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int num = sc.nextInt();


        for(int i = 1; i <= num; i++) {

            for(int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
