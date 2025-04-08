package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] orginArr = {1, 2, 3};
        System.out.println("orignArr :"+orginArr.hashCode());
        System.out.println(Arrays.toString(orginArr));
        int[] copyArr = orginArr; // 얇은 복사
        System.out.println("copyArr :"+copyArr.hashCode());
        System.out.println(Arrays.toString(copyArr));
        System.out.println("======================================================= ");

        copyArr[0] = 1000;
        System.out.println("orignArr :"+ Arrays.toString(orginArr));
        System.out.println("copyArr :"+ Arrays.toString(copyArr));

        test(copyArr);
        System.out.println("orignArr :"+ Arrays.toString(orginArr));
        System.out.println("copyArr :"+ Arrays.toString(copyArr));
        int[] test = returntest();
        System.out.println("test :"+ Arrays.toString(test));
    }


    public static void test(int[] arr) {
        System.out.println("arr의 hashcode()값 :"+arr.hashCode());
        arr[0] =1;

    }
    public static int[] returntest() {
        return new int[]{100,200,300} ;
    }
}
