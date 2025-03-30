/*
 * 정수 하나를 입력받아서 아래와 같은 출력값을 출력하시오.
 *
 *
 * 정수하나를 입력하세요 : 5
 *         1 x 8 + 1 = 9
 *        12 x 8 + 2 = 98
 *       123 x 8 + 3 = 987
 *      1234 x 8 + 4 = 9876
 *     12345 x 8 + 5 = 98765
 *
 *
 *             1 x 8 + 1 = 9
 *            12 x 8 + 2 = 98
 *           123 x 8 + 3 = 987
 *          1234 x 8 + 4 = 9876
 *         12345 x 8 + 5 = 98765
 *        123456 x 8 + 6 = 987654
 *       1234567 x 8 + 7 = 9876543
 *      12345678 x 8 + 8 = 98765432
 *     123456789 x 8 + 9 = 987654321
 * 정수하나를 입력하세요 : 9
 * */

package com.ohgiraffers.section01.conditional.level03;
import java.util.Scanner;
public class Application13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 정수 입력 받기
        System.out.print("정수 하나를 입력하세요 : ");
        int n = sc.nextInt();
        // 각 줄의 값을 출력하는 반복문
        for (int i = 1; i <= n; i++) {
            StringBuilder leftPart = new StringBuilder(); // 왼쪽 숫자 부분 저장
            for (int j = 1; j <= i; j++) {
                leftPart.append(j);  // '1', '12', '123', ... 식으로 숫자 생성
            }
            // 오른쪽 계산 부분
            int result = Integer.parseInt(leftPart.toString()) * 8 + i;
            // 출력에서의 공백 처리
            String spaces = " ".repeat(n - i);
            // 출력 형식 맞추어 출력
            System.out.println(spaces + leftPart + " x 8 + " + i + " = " + result);
        }
        sc.close();
    }
}

