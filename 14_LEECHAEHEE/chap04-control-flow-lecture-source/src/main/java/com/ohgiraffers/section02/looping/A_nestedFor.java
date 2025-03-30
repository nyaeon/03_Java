package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromTwoToNine() {
       int result = 0;
        for (int i = 2; i <= 9; i++) {
//            for (int j = 1; j < 10; j++) {
//                System.out.println(i + " * " + j + " = " + (i * j));
//            }
            printGugudanOf(i);
            System.out.println();
        }
    }

    public void printGugudanOf(int i) {
        for (int j = 1; j < 10; j++) {
               System.out.println(i + " * " + j + " = " + (i * j));
           }
    }

    public void printStarInputRowTimes() {
        // 키보드로 정수를 하나 입력받아 해당 정수 만큼 한 행에 "*"를 5개씩 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++) { // 열
            for(int j = 1; j <= i; j++) { // 행
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
