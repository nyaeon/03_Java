package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /*
        값의 형태별 기본값
        정수 : 0
        실수 : 0.0
        논리 : false
        문자 : \0000
        참조 : null
         */

        //  배열의 크기만 할당한 상태로, 공간만 만들어진 상태.
        int[] iArr = new int[5];
        System.out.println(Arrays.toString(iArr));

        boolean[]  bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));

        char[]  cArr = new char[5];
        System.out.println(Arrays.toString(cArr));

        // 크기 할당 및 초기화를 한 번에 하고 싶을 때
        int[] iArr2 = {10,20,30,40};
        int[] iArr3 = new int[]{10,20,30,40};

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));

        //test({10,11,12,13,14});
        test(iArr2);
        test(new int[]{10,11,12,13,14});

        String[] sArr = new String[5];
        System.out.println(Arrays.toString(sArr));

        String[] sArr2 = {"apple", "banana", "grapes", "pineapple"};

        // 배열의 각 요소를 확인하는 3가지 방법
        // 1. 단순 for문 사용
        for(int i=0; i< sArr2.length; i++){
            System.out.println(sArr2[i]);
        }
        // 2. Arrays.toString() 사용
        System.out.println(Arrays.toString(sArr2));

        // 3. for-each(향상된 for문)
        //- 해당 내용을 단순히 불러올 때 가장 많이 사용되는 반복문
        // jdk 1.5부터 추가
        for (String str : sArr2) {
            System.out.println(str);
        }

        for(int i: iArr2){ // 얘가 가지고 있는 각각의 자료형을 받을 준비
            System.out.println(i);
        }

        // 주의 : 향상된 for문은 배열에 인덱스에 차례로 접근할 때는
        // 편하게 사용할 수 있지만 값을 변경할 수는 없음.
        for(int i: iArr2){
            i += 10;
        }
        System.out.println(Arrays.toString(iArr2));
    }

    public static void test(int[] arr) {

    }
}
