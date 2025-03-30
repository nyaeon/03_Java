package com.ojgiraffers.section02;

import java.util.Scanner;

public class D_doWhile { // 조건식이 참일여부와 상관없이 무조건 실행하고 시작
    public void testSimpleDoWhileStatement(){
        do {
            System.out.println("실행 될까?");
        } while(false);
        System.out.println("반복 종료 이후");
    }
    public void testDoWhile(){

        int sumPrice = 0;
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do{
            choice = sc.nextInt();
            System.out.println("담을래 뺄래?");
            System.out.println("1.  담을래(+1000)");
            System.out.println("2. 뺄래    (-1000)");
            System.out.println("3. 나갈래");
            System.out.print("번호를 고르시오.");
            if (choice == 1) {sumPrice +=1000;}
            else if (choice == 2) {sumPrice -=1000;}
            else if (choice == 3) {break;}


        } while (choice < 3);
        System.out.println("휴~~~ 나왔다.");
    }
}

