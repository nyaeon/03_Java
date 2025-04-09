package com.ohgiraffers.section02.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("가로 행의 수를 입력하세요 : " );
        int a = sc.nextInt();
        System.out.print("세로 행의 수를 입력하세요 : " );
        int b = sc.nextInt();
        char[][] arr = new char[a][b];

        boolean flag = false;
        if (a <= 10 && a >= 1) {
            if (b <= 10 && b >= 1) {
                flag = true;
            } else {
                System.out.println("반드시 1~10까지 정수를 입력해야 합니다. 다시 입력하세요");
            }
        } else {
            System.out.println("반드시 1~10까지 정수를 입력해야 합니다. 다시 입력하세요");
        }

//        Math.random()
//        65 ~ 91까지 아스키코드 대문자 불러오는 과정에서 중단

        if (flag) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = (char) (Math.random() * 26 + 65);
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        }

    }
}
