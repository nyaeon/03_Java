package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application13 {

    public static void main(String[] args) {

        /*
        * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
        *
        *
        * 정수하나를 입력하세요 : 5
        *         1 x 8 + 1 = 9
        *        12 x 8 + 2 = 98
        *       123 x 8 + 3 = 987
        *      1234 x 8 + 4 = 9876
        *     12345 x 8 + 5 = 98765
        *
        *
        *             1 x 8 + 1 = 9
        *            12 x 8 + 2 = 98
        *           123 x 8 + 3 = 987
        *          1234 x 8 + 4 = 9876
        *         12345 x 8 + 5 = 98765
        *        123456 x 8 + 6 = 987654
        *       1234567 x 8 + 7 = 9876543
        *      12345678 x 8 + 8 = 98765432
        *     123456789 x 8 + 9 = 987654321
        * 정수 하나를 입력하세요 : 9
        * */
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 하나를 입력하세요 : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // 공백 출력 (숫자 오른쪽 정렬을 위해)
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            // 왼쪽 숫자 만들기 (1, 12, 123, ...)
            long leftNum = 0;
            for (int j = 1; j <= i; j++) {
                leftNum = leftNum * 10 + j;
            }

            // 계산 및 출력
            long result = leftNum * 8 + i;
            System.out.println(leftNum + " x 8 + " + i + " = " + result);
        }

        sc.close();
    }

}
