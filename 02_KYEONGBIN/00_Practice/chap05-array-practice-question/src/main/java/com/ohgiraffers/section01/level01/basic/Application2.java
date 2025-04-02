package com.ohgiraffers.section01.level01.basic;

import java.util.Arrays;
import java.util.Scanner;

        /* 길이가 5인 String 배열을 선언하고
         * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
         * 스캐너로 0부터 4까지의 정수를 입력 받아
         * 해당 정수의 인덱스에 있는 과일을 출력하세요
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */

public class Application2 {
    public static void main(String[] args) {

        String[] fruits = {"딸기", "바나나", "복숭아", "키위", "사과"};
        
        System.out.println("We have " + Arrays.toString(fruits));
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease enter a number from 0 to 4");
            System.out.println("Enter \"e\" to exit: ");

            String input = scanner.nextLine();

            if (input.equals("e")) {
                System.out.println("The service is closing");
                break;
            }

            try {
                // 입력값을 정수로 변환
                int num = Integer.parseInt(input);

                // 올바른 범위인지 확인 후 과일 출력
                if (num >= 0 && num < fruits.length) {
                    System.out.println("\nHere's your " + fruits[num]);
                } else {
                    System.out.println("\n준비된 과일이 없습니다.");
                }
            } catch (NumberFormatException e) {
                // 정수가 아닌 값을 입력하면 예외 처리
                System.out.println("\n올바른 숫자를 입력하세요.");
            }
        }

        scanner.close(); // Scanner 닫기
    }
}
