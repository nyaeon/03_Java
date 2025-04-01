package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        int[] originArr = {1, 2, 3};
        System.out.println(originArr.hashCode());
        System.out.println(Arrays.toString(originArr));
        int[] copyArr = originArr;
        System.out.println("copyArr : " +copyArr.hashCode());
        System.out.println(Arrays.toString(copyArr));
        copyArr[0]= 1000;
        System.out.println("==================================");
        System.out.println("originArr = " + Arrays.toString(originArr));
        System.out.println("copyArr = " + Arrays.toString(copyArr));


        int[] test = returnTest();
        System.out.println("test = " + Arrays.toString(test));

    }

    public static void test(int[] arr)
    {
        System.out.println("arr의 hashcode() :"+arr.hashCode());
        arr[0]=1;

    }

    public static int[] returnTest(){
        return new int[]{100,200,300};
    }







}
