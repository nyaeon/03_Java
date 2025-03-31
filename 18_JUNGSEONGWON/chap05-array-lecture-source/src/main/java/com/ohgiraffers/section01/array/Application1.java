package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application1 {
    
    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        
        int sum = 0;
        
        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;

        System.out.println("sum = " + sum);

        int[] arr = new int [5];
        // 배열 문 작성 양식 [0][0][0][0][0] arr[] 안에는 주소값이 들어간다.
        // HEAP이라는 공간에는 값이 없는 것을 못 들어가니 STACK의 값들을 가져와서 사용한다.
        // STACK에서 값이 없는 경우 0의 경우에도 0의 주소값을 가지고 온다.
        System.out.println(arr); // 주소값 출력 [I@ : int형식의 주소 임을 뜻한다.
        System.out.println(Arrays.toString(arr));

        // 배열 초기화
        for (int i = 0; i < 5; i++){
            arr[i] = (i + 1) * 10;
        }
        // 반복문을 활요해서 초기화 된 값 확인

        for (int i = 0;i < 5; i++){
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr)); // 반복문 출력을 한번에 묷어서 출력.
        
        int sum2 = 0;
        for (int i = 0; i < 5; i++){
            sum2 += arr[i];
        }
        System.out.println("sum2 = " + sum2);
    }
}
