package com.ohgiraffers.section01.array;

import java.util.Arrays;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {

        int[] score = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.print((i + 1) + "번째 학생의 자바 점수를 입력해주세요.");
            score[i] = sc.nextInt();
        }
        System.out.println("현재까지 입력된 값 : " + Arrays.toString(score));

        // for each문으로 내용 변경은 불가능하지만, 이런 건 할 수 있음
        int sum = 0;
        for (int perScore : score) {
            sum += perScore;
        }
        System.out.println("합계 : " + sum);

        double avg = sum / score.length;
        System.out.println("평균 : " + avg);

    }

}
