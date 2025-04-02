package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int[] originArr = {1, 2, 3};
        System.out.println("originArr : " + originArr.hashCode());
        System.out.println(Arrays.toString(originArr));

        int[] copyArr = originArr;;// 참조 주소값 (얕은복사)
        System.out.println("copyArr : " + copyArr.hashCode()); // originArr과 주소가 동일
        System.out.println(Arrays.toString(copyArr));

        copyArr[0] = 1000;
        System.out.println("========================================");
        System.out.println("originArr = " + Arrays.toString(originArr)); // copyArr에서의 변경사항이 originArr에도 반영됨
        System.out.println("copyArr = " + Arrays.toString(copyArr));

        test(copyArr); // 메서드의 인자로 넘겨도 주소가 동일함
        System.out.println("========================================");
        System.out.println("originArr = " + Arrays.toString(originArr)); // copyArr에서의 변경사항이 originArr에도 반영됨
        System.out.println("copyArr = " + Arrays.toString(copyArr));

        int[] test = returnTest();
        System.out.println("test.hashCode() = " + test.hashCode());
        System.out.println("test = " + Arrays.toString(test));
    }

    public static void test(int[] arr) {
        System.out.println("arr의 hashCode() :" + arr.hashCode());
        arr[0] = 1;
    }

    public static int[] returnTest() {
        return new int[]{100, 200, 300};
    }
}
