package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application_03 {

    public static void main(String[] args) {

        /***
         * 값의 형태별 기본값
         * 정수: 0
         * 실수: 0.0
         * 논리: false
         * 문자: \u0000 (널 문자)
         * 참조: null
         */

        int[] iArr = new int[5];
        System.out.println(Arrays.toString(iArr));

        boolean[] bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));

        char[] cArr = new char[5];
        System.out.println(Arrays.toString(cArr));

        // 크기 할당 및 초기화를 한번에 하는 방법
        int[] iArr2 = {10, 20, 30, 40};
        int[] iArr3 = new int[] {10, 20, 30, 40}; // new int[] 사용 가능

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));

        // test 메서드 호출 (배열 전달)
        test(iArr);
        test(new int[] {10, 11, 12, 13, 14});

        String[] sArr = new String[5]; // [null, null, null, null, null]
        System.out.println(Arrays.toString(sArr));

        String[] sArr2 = {"apple", "banana", "pineapple"};
        System.out.println(Arrays.toString(sArr2));

        // 배열의 각 요소를 확인하는 세 가지 방법
        // 1. 단순 for문 사용
        for (int i = 0; i < sArr2.length; i++) {
            System.out.println(sArr2[i]);
        }

        // 2. Arrays.toString() 사용
        System.out.println(Arrays.toString(sArr2));

        // 3. 향상된 for 문 (JDK 1.5부터 지원)
        for (String str : sArr2) {
            System.out.println("str = " + str);
        }

        for (int i : iArr2) {
            System.out.println(i);
        }

        /***
         * 주의:
         * 향상된 for 문은 배열의 인덱스를 차례로 접근할 때는 편리하지만,
         * 값을 변경할 수 없다. (기본 자료형의 경우 값이 복사되기 때문)
         */
        for (int i : iArr2) {
            i += 10; // 배열 원본 값에는 영향을 주지 않음
        }
        System.out.println(Arrays.toString(iArr2)); // 값이 변하지 않음
    }

    public static void test(int[] iArr) {
        System.out.println("test 메서드 호출: " + Arrays.toString(iArr));
    }
}
