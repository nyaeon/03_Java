package com.ohgiraffers.section2.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine(){

        for(int dan = 2; dan <= 9; dan++){
            System.out.println('\n');
            System.out.println("=== " + dan + "단" + " ===" );
            for(int su = 1; su <= 9; su++){
                System.out.println(dan + "*" + su + " = " + dan*su);
            }

        }
    }

    public void printStarInputRowRimes() {

        // 키보드로 정수를 하나 입력받아 해당 정수만큼 한 행에 "*"를 5개씩 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {   // 행
            for (int j = 1; j < 6; j++) {
                System.out.print("*");
            } System.out.println();
        }
    }

    public void printTriangleStar() {

        Scanner sc = new Scanner(System.in) ;
        System.out.println("출력할 줄 수를 입력하세요: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}

