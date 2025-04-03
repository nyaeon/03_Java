package com.ohgiraffers.section01.level02.normal;

import java.util.*;

public class Application7 {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] intArr = new int[10];
        int min=11;
        int max = 0;
        for(int i=0; i<intArr.length; i++){
            intArr[i]= rand.nextInt(10)+1;
            if(intArr[i]<min){
                min=intArr[i];
            }
            if(intArr[i]>max){
                max=intArr[i];
            }
        }
        System.out.println(Arrays.toString(intArr));
        System.out.println("최댓값 : " + max);
        System.out.println("최솟값 : " + min);
        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */
    }
}
