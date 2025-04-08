package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 임의의 숫자를 입력받아 해당 계절을 출력해주세요
         * 단, 1~12사이의 숫자가 아닌 값이 들어는것은 "잘못입력하셨습니다"를 출력
         * 계절 구분
         * 봄 : 3월,4월,5월
         * 여름: 6월,7월,8월
         * 가을: 9월,10월,11월
         * 겨울: 12월,1월,2일
         *
         * -----  출력 -----
         * 숫자를 입력하세요 : 1
         * 겨울
         * */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number (1 to 12) to find the season. Enter 'q' to quit:");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Goodbye!");
                break;
            }

            if (!input.matches("\\d+")) {
                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                continue;
            }

            int month = Integer.parseInt(input);

            if (month >= 1 && month <= 12) {
                if (month == 12 || month == 1 || month == 2) {
                    System.out.println("Season: Winter");
                } else if (month >= 3 && month <= 5) {
                    System.out.println("Season: Spring");
                } else if (month >= 6 && month <= 8) {
                    System.out.println("Season: Summer");
                } else {
                    System.out.println("Season: Autumn");
                }
            } else {
                System.out.println("Invalid number. Please enter a number between 1 and 12.");
            }
        }

        sc.close();
    }
}
