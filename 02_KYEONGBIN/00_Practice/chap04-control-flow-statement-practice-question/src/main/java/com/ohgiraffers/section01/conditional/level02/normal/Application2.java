package com.ohgiraffers.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your weight (kg): \n(Enter \"q\" to quit)");
            String weight = sc.nextLine();
            if (weight.equalsIgnoreCase("q")) {
                System.out.println("Goodbye");
                break;
            }

            System.out.println("Enter your height (m): \n(Enter \"q\" to quit)");
            String height = sc.nextLine();
            if (height.equalsIgnoreCase("q")) {
                System.out.println("Goodbye");
                break;
            }

            if (!weight.matches("\\d+(\\.\\d+)?") || !height.matches("\\d+(\\.\\d+)?")) {
                System.out.println("Please enter valid numbers.");
                continue;
            }

            double weightDouble = Double.parseDouble(weight);
            double heightDouble = Double.parseDouble(height);

            double bmi = weightDouble / (heightDouble * heightDouble);

            if (bmi < 20) {
                System.out.println("You are underweight.");
            } else if (bmi < 25) {
                System.out.println("You have a normal weight.");
            } else if (bmi < 30) {
                System.out.println("You are overweight.");
            } else {
                System.out.println("You are obese.");
            }
        }

        sc.close();
    }
}
