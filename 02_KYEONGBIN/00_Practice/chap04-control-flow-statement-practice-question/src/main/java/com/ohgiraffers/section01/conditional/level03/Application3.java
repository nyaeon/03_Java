package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 국어, 영어, 수학 점수를 입력받아
         * 평균 점수가 60점 이상이면서 각 과목이 40점 이상인 조건이 만족하면 "합격입니다!" 를 출력하세요,
         * 단, 합격이 아닌 경우 불합격 사유가 무엇인지를 모두 출력해주어야 합니다.
         * 평균점수 미달인 경우 "평균점수 미달로 불합격입니다." 라고 출력하고,
         * 과목당 과락 점수가 있는 경우 "xx 과목의 점수 미달로 불합격 입니다." 출력하세요
         *
         * -- 입력 예시 --
         * 국어 점수를 입력하세요 : 60
         * 영어 점수를 입력하세요 : 30
         * 수학 점수를 입력하세요 : 20
         *
         * -- 출력 예시 --
         * 평균 점수 미달로 불합격입니다.
         * 영어 점수 미달로 불합격입니다.
         * 수학 점수 미달로 불합격입니다.
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Korean score (or 'q' to quit): ");
            String korInput = sc.nextLine();
            if (korInput.equalsIgnoreCase("q")) break;

            System.out.println("Enter English score (or 'q' to quit): ");
            String engInput = sc.nextLine();
            if (engInput.equalsIgnoreCase("q")) break;

            System.out.println("Enter Math score (or 'q' to quit): ");
            String mathInput = sc.nextLine();
            if (mathInput.equalsIgnoreCase("q")) break;

            if (!korInput.matches("\\d+") || !engInput.matches("\\d+") || !mathInput.matches("\\d+")) {
                System.out.println("Invalid input. Please enter only numbers.");
                continue;
            }

            int korean = Integer.parseInt(korInput);
            int english = Integer.parseInt(engInput);
            int math = Integer.parseInt(mathInput);

            int average = (korean + english + math) / 3;
            boolean isPassed = true;

            if (average < 60) {
                System.out.println("평균 점수 미달로 불합격입니다.");
                isPassed = false;
            }

            if (korean < 40) {
                System.out.println("국어 점수 미달로 불합격입니다.");
                isPassed = false;
            }

            if (english < 40) {
                System.out.println("영어 점수 미달로 불합격입니다.");
                isPassed = false;
            }

            if (math < 40) {
                System.out.println("수학 점수 미달로 불합격입니다.");
                isPassed = false;
            }

            if (isPassed) {
                System.out.println("합격입니다!");
            }

            System.out.println(); // 빈 줄로 가독성 추가
        }

        sc.close();
    }
}
