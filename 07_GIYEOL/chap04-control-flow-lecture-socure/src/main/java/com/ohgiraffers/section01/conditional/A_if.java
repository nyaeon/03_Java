package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    public void test(){
        Scanner sc = new Scanner(System.in);
        /***
         * 단일 if 문 테스트
         */
        System.out.print("정수 하나 입력하세요: ");
        int input =   sc.nextInt();
        //만약 입력받은 값이 짝수면
        // "짝수다" 라고 출력
        if(input % 2== 0){
            System.out.println("짝수 입니다");
        }
        else{
            System.out.println("홀수 입니다");
        }



    }


    public void test2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양수 하나 입력 :");
        int input = sc.nextInt();
              //      if(input > 0){
             //        if(input % 2 != 0){
            //           System.out.println("입력값은 양수아면서 홀수입니다.");
           //     }
          // }
        if(input > 0 && input % 2 != 0){
            System.out.println("입력값은 양수아면서 홀수입니다.");
        }
        B_ifElse b = new B_ifElse();
        b.test1();
}
}
