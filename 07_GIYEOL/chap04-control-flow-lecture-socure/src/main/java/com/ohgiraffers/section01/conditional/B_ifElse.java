package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

    public void test1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력:");
        int input = sc.nextInt();
        /***
         * 만약에 (홀수라면) {"입력값은 홀수 "} 아니라면 {"입력값은 짝수"}
         */
        if(input % 2 !=0){
            System.out.println("입력값은 홀수");
        }
        else{
            System.out.println("입력값은 짝수");
        }
    /*
        public void test2(){
        // 정수를 하나 입력받아 양수와 음수 구분 양수일떄
        // 짝수 인지 구별


            System.out.print("정수하나 입렧");
            int input = sc.nextInt();
            if(input >= 0){
                if(input % 2 ==0){
                System.out.println("양수이면서 짝수");
            }}else {
                System.out.println("양수이면서 홀수");
            }
            else {
                System.out.println("");
            }
        }
*/







    }
}
