package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        int[] iArr;

        iArr = new int[10];
        System.out.println(iArr.length);
        System.out.println();

    int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */
    }
}
