package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class D_dowhile {
    public void testdowhile() {
        do {
            System.out.print("실행?");
        }    while (false);
    System.out.print("반복 종료 이후");

    }
    public void testdowhile2() {
        int sumprice =0;
        Scanner sc = new Scanner(System.in);
        int choice =0;
        do {
            System.out.println("담기 or 빼기");
            System.out.println("1.담기 (+1000)");
            System.out.println("2.빼기 (-1000)");
            System.out.println("3.나가기");
            System.out.println("번호 고르기:");
            choice = sc.nextInt();
            if (choice == 1) {
                sumprice += 1000;
            }else if (choice == 2) {
                sumprice -= 1000;
            }else{
                System.out.print("현재 합계는 "+ sumprice);
            }
        }while(choice < 3);
        System.out.println("돈을 아꼈다");
    }
}
