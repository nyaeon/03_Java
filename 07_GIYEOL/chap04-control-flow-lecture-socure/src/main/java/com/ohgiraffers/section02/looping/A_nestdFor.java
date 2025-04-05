package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestdFor {
    public void printGugudan() {
        for (int dan =2; dan <=9; dan++) {
            for(int su =1; su < 10;su++){
                System.out.print(dan+" * "+ su +" = "+(dan*su));

            }
        }
    }
    public void printGugudan2() {
        for (int su =2; su <=9; su++) {

        }
    }
    public void printinputrow() {
        //키보드로 정수하나를 입력 받아 해당 정수 만큼 한 행에 "*"를 5개씩 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행 입력");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<i;j++){}
            System.out.print("*");
        }
    }
    //*
    //**
    //***
    public void printstars() {
        System.out.print("출력할 줄 수 입력:");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for(int i =1; i<6 ; i++){ //행
         //열
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
