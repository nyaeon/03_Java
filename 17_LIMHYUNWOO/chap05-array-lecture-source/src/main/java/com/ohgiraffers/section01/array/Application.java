package com.ohgiraffers.section01.array;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        int num1 = 10 ;
        int num2 = 20 ;
        int num3 = 30 ;
        int num4 = 40 ;
        int num5 = 50  ;

        int sum = 0 ;
        sum += num1 ;
        sum += num2 ;
        sum += num3 ;
        sum += num4 ;
        sum += num5 ;
        System.out.println("sum = " + sum);
        // = 기준으로 오른쪽은 스택에 생성되고 왼쪽은 힙에 생성된다. arr에는 배열의 주소값을 저장
        int[] arr = new int [5];  // [1][2][3][4][5]
//        System.out.println(arr);
        System.out.println(Arrays.toString(arr)); // 배열 초기화
        for(int i =0 ; i < 5 ; i++){
            arr[i] = (i + 1) * 10;
    }
        System.out.println(Arrays.toString(arr));
    int sum2 = 0 ;
    for(int i =0 ; i < 5 ; i ++){
        sum2 +=arr[i];
    }
}
}
