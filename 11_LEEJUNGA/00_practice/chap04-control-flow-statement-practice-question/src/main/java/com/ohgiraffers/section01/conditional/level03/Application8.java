package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application8 {

    public static void main(String[] args) {

        /*
            1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.

            ex.
            정수를 하나 입력하세요 : 8
            1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
	    */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요 : ");
        int n = sc.nextInt();
        int sum = 1;
        StringBuilder msg = new StringBuilder("1");
        for (int i = 2; i <= n; i++) {
            sum += i;
            msg.append(" + ").append(i);
        }

        System.out.println(msg + " = " + sum);
    }
}