package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {

        // originArr 배열에 생성된 주소값을 복사한다.
        int[] originArr = {1, 2, 3};
        System.out.println("originArr : " + originArr.hashCode());
        System.out.println("originArr : " + Arrays.toString(originArr));
        int[] copyArr = originArr; // 참조 주소값 (얕은복사)
        System.out.println("copyArr : " + copyArr.hashCode());
        System.out.println("copyArr : " + Arrays.toString(copyArr));

        System.out.println("========================================");

        copyArr[0] = 1000;
        System.out.println("originArr : " + Arrays.toString(originArr));
        System.out.println("copyArr : " + Arrays.toString(copyArr));

        test(copyArr);

        System.out.println("========================================");

        System.out.println("originArr : " + Arrays.toString(originArr));
        System.out.println("copyArr : " + Arrays.toString(copyArr));

        int[] test = returnTest();
        System.out.println("test = " + Arrays.toString(test));
    }

    public static void test(int[] arr) {
        System.out.println("arr의 해쉬코드 값 : " + arr.hashCode());

        arr[0] = 1;
    }

    public static int[] returnTest () {

        return new int[]{100, 200, 300};
    }

}
