package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTowToNine() {

        for (int dan = 2; dan <= 9; dan++) {

            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + dan * su);
            }
            printGugudanOf(dan);
            System.out.println(dan);
        }
    }

    public void printGugudanOf() {
        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + dan * su);
        }
    }

    public void printStarInputRowTimes() {

        // 키보드로 정수를 하나 입력 받아 해다 점수 만큼 한 행에 "*"를 5개씩 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) { // 행

            for (int j = 1; j < 6; i++) {
                System.out.println("*");
            }
            System.out.println();
        }

    }
    public void printTriangleStars() {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) { //행

            // 열
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}