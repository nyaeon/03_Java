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
        * 정수하나를 입력하세요 : 9
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수하나를 입력하세요 : ");
        int n = sc.nextInt();

        int tmpNum = 0;
        for (int i = 0; i < n; i++) {
          // (공백 * (n - i + 1)), (firstNum * 10 + i), x, 8, +, (i+1))

            // 공백 * (n - i + 1)
            String blank = " ".repeat(n - i - 1);

            // 곱하기 앞 숫자
            int num1 = tmpNum * 10 + (i + 1);
            tmpNum = num1;

            // 더하기 뒤 숫자
            int num2 = i + 1;

            // 결과
            int result = num1 * 8 + num2;

            // 출력
            System.out.println(blank + num1 + " x " +  8 + " + " +  num2 + " = " + result);
        }
    }

}
