package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));

        // 배열 초기화
        for (int i = 0; i < 5; i++) {
            arr[i] = (i + 1) * 10;
        }

        // 반목분을 활용해서 초기화된 값 확인
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
    }
}
