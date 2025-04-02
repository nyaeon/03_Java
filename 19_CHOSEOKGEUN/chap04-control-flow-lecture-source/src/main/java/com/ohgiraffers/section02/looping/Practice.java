package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 줄 수를 입력하세요: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) { // `<=`로 변경하여 입력한 줄 수까지 출력
            System.out.println("*".repeat(i)); // 문자열 반복을 위해 `.repeat(i)` 사용
        }
        sc.close(); // Scanner 닫기 (자원 해제)
    }
}
