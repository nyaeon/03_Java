package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease enter a positive **odd** integer (or 'q' to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("The service is closing.");
                break;
            }

            int num;
            try {
                num = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("숫자 또는 'q'만 입력하세요.");
                continue;
            }

            if (num <= 0 || num % 2 == 0 || num > 17) {
                System.out.println("양수 혹은 홀수만 입력해야 합니다. (18 미만)");
                continue;
            }

            int[] arr = new int[num];
            int mid = num / 2;

            for (int i = 0; i <= mid; i++) {
                arr[i] = i + 1;
            }

            for (int i = mid + 1; i < num; i++) {
                arr[i] = num - i;
            }

            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
