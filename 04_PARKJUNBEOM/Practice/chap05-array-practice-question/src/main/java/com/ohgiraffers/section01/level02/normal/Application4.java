package com.ohgiraffers.section01.level02.normal;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("\nEnter any key to start (Enter 'q' to quit): ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("The service is closing.");
                break;
            }

            int[] lottoNum = new int[6];
            int count = 0;

            while (count < 6) {
                int num = random.nextInt(45) + 1;
                boolean duplicate = false;

                for (int i = 0; i < count; i++) {
                    if (lottoNum[i] == num) {
                        duplicate = true;
                        break;
                    }
                }

                if (!duplicate) {
                    lottoNum[count] = num;
                    count++;
                }
            }

            Arrays.sort(lottoNum);

            System.out.print("로또 번호: ");
            for (int i : lottoNum) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
