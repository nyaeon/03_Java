 /*
 * 나이를 입력 받아 입력받은 수가 13세 이하이면 "어린이"출력, 13세 초과 ~ 19세 이하이면 "청소년" 출력, 19세 초과 "성인"을 출력하세요.
 * 나이를 입력하세요 : 12
 * ---- 출력 ----
 * 어린이
 * 나이를 입력하세요 : 29
 * 성인
 * */
package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;
public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true) {
            System.out.print("0 이외에 정수를 입력하시오.");
            number = sc.nextInt();
            if (number == 0) {
                System.out.println("0 이외의 정수를 다시 입력하시오");
            } else {
                break;
            }
        }
        if (number > 0 || number <=13 ) {
            System.out.println("어린이");
        } else if (number > 13 && number <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }
        sc.close();
    }
}
