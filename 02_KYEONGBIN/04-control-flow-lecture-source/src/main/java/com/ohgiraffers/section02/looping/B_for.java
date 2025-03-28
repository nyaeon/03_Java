package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_for {

    public void printGugudanFromTwoToNine() {

//        for(int dan = 2; dan <= 9; dan++) {
//            for(int su = 1; su <= 10; su++) {
//                System.out.println(dan + "x" + su + " = " + (dan * su));
//            }
//        }
    }

//    public void printGugudan() {
//        for (int i = 1; su < 10; su++) {
//            System.out.print(su);
//
//        }
//    }

    public void printStarInputRowTimes() {

        // 키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*" 를 5개씩 출력하시오!
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}