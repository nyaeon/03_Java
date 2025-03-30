package com.ojgiraffers.section02.looping;

import java.util.Scanner;

public class A_nestedFor {
    public void printGugudanFromToNine() {
        for(int i=2; i < 10 ; i++){
            System.out.println(i + " 단 시작!");
            for(int j=1 ; j < 10 ; j++){
                System.out.println(i+ " * "+ j + " = " + (i * j));
            }
            System.out.println();
        }
    }

    // *
    // **
    public void printTriangleSters(){
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        for(int i=0 ; i< line ; i++){
            for(int j=0 ; j < i; j++){
                System.out.print("**");
            }
            System.out.println();
        }
    }
}
