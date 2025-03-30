package HOMEWORK2_week.chep02;

import java.util.Scanner;

public class Application1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("숫자를 입력하세요:");
            int num = sc.nextInt();

            if (num % 2 == 0 ) {
                System.out.print("짝수 입니다");
            } else {
                System.out.print("홀수 입니다");
            }

        }
}

