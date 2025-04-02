package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application11 {

    public static void main(String[] args) {

        /*
            10 이하의 임의의 난수를 발생시키고 사용자에게 정수 한 개를 입력 받아
            난수가 입력한 정수보다 작으면 “입력하신 정수보다 작습니다.” 출력,
            난수가 입력한 정수보다 크면 “입력하신 정수보다 큽니다.”를 출력하세요.

            단, 정답을 맞출 때까지 정수를 계속 입력 받아 프로그램이 반복 되도록 하고
            정답인 경우 “정답입니다, n회 만에 정답을 맞추셨습니다.”처럼 몇 번째에 정답을 맞췄는지 출력하세요.
       */

        Scanner sc = new Scanner(System.in);

        // 1. 임의의 난수 뽑기
        int random = (int) (Math.random() * 10) + 1;
        System.out.println(random);

        // 2. 몇 번만에 맞췄는지 담을 변수 생성
        int count = 0;

        while (true) {
            // 3. 사용자에게 값을 받기
            System.out.print("1~10 사이의 임의의 난수를 맞춰보세요 : ");
            int user = sc.nextInt();

            // 4. 사용자가 입력한 값이 1~10 사이의 숫자인지 확인
            if (user >= 1 && user <= 10) {
                // 5. 사용자가 입력한 값과 랜덤 값이 같은지 다른지 확인
                if (user != random) { // 5-1. 값이 다르다면
                    // 6. 입력한 값이 random 값보다 큰지 작은지 확인
                    if (user > random) { // 6-1. 사용자 값이 random 값보다 클 때
                        System.out.println("입력하신 정수보다 작습니다.");
                    } else { // 6-2. 사용자 값이 random 값보다 작을 때
                        System.out.println("입력하신 정수보다 큽니다.");
                    }
                    count++;
                } else { // 5-2. 값이 같다면
                    count++; // 맞춘 것도 횟수에 들어가기 때문에
                    System.out.println("정답입니다, " + count + "회 만에 정답을 맞추셨습니다.");
                    break;
                }

            } else {
                System.out.println("1~10 사이의 숫자를 입력해주세요.");
            }
        }

    }
}
