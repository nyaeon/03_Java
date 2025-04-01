package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        int[] originArr = {1, 2, 3};
        System.out.println("orginArr : " + originArr.hashCode());
        System.out.println(Arrays.toString(originArr));

        int[] copyArr = originArr; //주소값이 담겨져 있음. 참조 주소값(얕은 복사)
        System.out.println("copyArr: " + copyArr.hashCode()); // 바라보는 대상 동일.
        System.out.println(Arrays.toString(copyArr));

        test(copyArr);
        //copyArr[0] = 1000;
        System.out.println("===================================");
        System.out.println("orginArr : " + Arrays.toString(originArr));
        System.out.println("copyArr : " + Arrays.toString(copyArr));

        test(copyArr);
        int[] test = returnTest();
        System.out.println("test = " + Arrays.toString(test));
    }

    public static void test(int[] arr) {
        System.out.println("arr의 hashCode() : " + arr.hashCode());

        arr[0] = 1;
    }

    public static int[] returnTest() {

        return new int[]{100,200,300};
    }
}