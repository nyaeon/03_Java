package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTowToNine() {
        /*
        *변수 i, j 생성
        * i * j i는 고정, j는 증가
        * 2<= i <= 9, 1<= j <= 9
        */
        for(int dan = 2; dan <=9; dan++){
            for(int su = 1; su <10; su++){
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println();
        }
    }

    public void printGugudan(int dan){
        for(int su = 1; su <10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInputRowTimes(){

        // 키보드로 정수를 하나 입력 받아 해당 점수만큼 한 행에 "*"를 5개씩 출력하세요.
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){  // 행
            for(int j =1; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printTriangleStars(){
        System.out.print("출력할 줄 수를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i = 1; i <= row; i++){  // 행

            // 열
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}