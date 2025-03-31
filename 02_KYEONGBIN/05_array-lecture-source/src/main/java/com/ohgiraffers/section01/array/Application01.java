package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application01 {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        // 변수들을 더해서 sum에 저장
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        // 배열 초기화
        int[] arr = new int[5]; // 배열의 크기는 5, 기본값은 0으로 초기화됨
        System.out.println(arr); // 배열의 객체 주소를 출력
        System.out.println(Arrays.toString(arr)); // 배열을 보기 좋게 출력

        // 배열에 값 할당
        for (int i = 0; i < 5; i++) {
            arr[i] = (i + 1) * 10; // arr[0] = 10, arr[1] = 20, arr[2] = 30, ...
            System.out.println(Arrays.toString(arr)); // 배열 상태 출력
        }

        // 배열 값 출력 (모든 값 출력)
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]); // 배열의 각 요소를 출력
        }
        System.out.println(Arrays.toString(arr)); // 배열을 보기 좋게 출력

        // 배열 값의 합 구하기
        int sum2 = 0;

        // 배열의 값을 더해서 sum2에 저장
        for (int i = 0; i < 5; i++) {
            sum2 += arr[i]; // arr[i] 값을 sum2에 더함
        }

        System.out.println("sum2 = " + sum2); // 배열 값의 합 출력
    }
}
