package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {
    /***
     * 단일 IF문 테스트
     */
    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 1개를 입력하세요: ");
        int input = sc.nextInt();
        // 만약에(입력받은 값이 짝수면){
        //  "짝수입니다"라고 출력한다.
        // }
        if(input % 2 == 0) {
            System.out.println("짝수입니다.");

        }
    }
    public void testNastedIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양수 하나를 입력해 주세요 : ");
        int input = sc.nextInt();
        //if(input > 0) {
        //    if(input % 2 != 0) {
        //        System.out.println("입력받은 값은 양수이면서 홀수입니다.");
        //    }
        //}
        if(input > 0 && input % 2 != 0) {
            System.out.println("입력받은 값은 양수이면서 홀수입니다.");
        }
    }
}
