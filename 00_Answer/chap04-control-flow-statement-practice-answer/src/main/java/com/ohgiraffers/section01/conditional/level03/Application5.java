package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
            사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
            단, 입력한 수는 1보다 크거나 같아야 합니다.
            만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

            ex.
            1이상의 숫자를 입력하세요 : 4			1 이상의 숫자를 입력하세요 : 0
            1 2 3 4 					        1 이상의 숫자를 입력해주세요.
        */

        Scanner sc = new Scanner(System.in);
        System.out.print("1이상의 숫자를 입력하세요 : ");
        int user = sc.nextInt();

        if (user >= 1) {
            for (int i = 1; i <= user; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("1 이상의 숫자를 입력해주세요.");
        }

    }
}
