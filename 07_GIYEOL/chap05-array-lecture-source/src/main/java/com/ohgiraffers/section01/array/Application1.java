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
 System.out.println("Sum: " + sum);
    int [] arr = new int[5]; // [0,1,2,3,4]의 데이터 값이 생성
    System.out.println(arr);
    System.out.println(Arrays.toString(arr));
    //배열 초기화
    for(int i =0; i<5;i++){
        arr[i] = (i+1)*10;
    }
    //반복문을 활용해서 초기화 된 값 확인
    for(int i =0; i<5 ;i++){
    System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr));
    int sum2 = 0;
    for(int i =0; i<5; i++){
        sum2 += arr[i];
    }
    System.out.println("sum2= "+sum2);
    }
}