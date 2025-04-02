package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        // int num1 = 10; int num2= 20; int num3 = 30...

        int[] arr = new int[5]; // 배열 자체만 선언 [0][0][0][0][0]
        System.out.println(arr); // 주소값 출력
        System.out.println(Arrays.toString(arr)); // 배열 안의 값을 출력

        for (int i = 0; i < 5; i++) {
            arr[i] = (i + 1) * 10;
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        
        int sum2 = 0;
        for (int i = 0; i < 5; i++) {
            sum2 += arr[i];
        }
        System.out.println("sum2 = " + sum2);
    }
}
