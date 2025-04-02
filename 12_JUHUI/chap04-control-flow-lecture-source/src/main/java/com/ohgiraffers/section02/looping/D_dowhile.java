package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_dowhile {

    public void testSimpleDoWhileStatement() {

        do {
            System.out.println("실행될까?");
        } while (false);

        System.out.println("반복 종료 이후");
    }

    public void testDoWhile(){

        int sumPrice = 0;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("담을래 뺄래?");
            System.out.println("1. 담을래(+1000)");
            System.out.println("2. 뺄래(-1000)");
            System.out.println("3. 나갈래");
            System.out.println("번호를 고르시오.");
            choice = scanner.nextInt();
            if (choice == 1) {
                sumPrice = sumPrice + 1000;
            } else if (choice == 2) {
                sumPrice = sumPrice - 1000;
            }
            System.out.println("현재 합계는 " + sumPrice);
        } while (choice < 3);

        System.out.println("휴~~ 나왔다.");
    }
}
