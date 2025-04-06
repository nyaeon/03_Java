package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번째 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first integer (or 'q' to quit): ");
            String firstInput = sc.nextLine();
            if (firstInput.equalsIgnoreCase("q")) {
                System.out.println("Program is closing.");
                break;
            }

            System.out.print("Enter the second integer (or 'q' to quit): ");
            String secondInput = sc.nextLine();
            if (secondInput.equalsIgnoreCase("q")) {
                System.out.println("Program is closing.");
                break;
            }

            if (!firstInput.matches("-?\\d+") || !secondInput.matches("-?\\d+")) {
                System.out.println("Invalid number input. Please enter integers only.");
                continue;
            }

            int num1 = Integer.parseInt(firstInput);
            int num2 = Integer.parseInt(secondInput);

            System.out.print("Enter an operator (+, -, *, /, %): ");
            String operator = sc.nextLine();

            int result = 0;
            boolean validOperator = true;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case "%":
                    if (num2 == 0) {
                        System.out.println("Cannot calculate remainder with zero.");
                        continue;
                    }
                    result = num1 % num2;
                    break;
                default:
                    validOperator = false;
                    break;
            }

            if (validOperator) {
                System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
            } else {
                System.out.println("Invalid operator entered. The program will exit.");
                break;
            }

            System.out.println();
        }

        sc.close();
    }
}
