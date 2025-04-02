package com.ohgiraffers.section01.array;

import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /* 정수 기본 자료형 - byte short int long
         * 값의 형태별 기본값
         * 정수 : 0
         * 실수 : 0.0
         * 논리 : false
         * 문자 : /u0000
         * 참조 : null
         *
         */
        int[] iArr = new int[5];
        System.out.println(Arrays.toString(iArr));

        boolean[] bArr = new boolean[5];
        System.out.println(Arrays.toString(bArr));

        double[] dArr = new double[5];
        System.out.println(Arrays.toString(dArr));

        char[]  cArr = new char[5];
        System.out.println(Arrays.toString(cArr));

        // 크기를 할당 및 초기화를 한번에 하고싶을떄
        int[] iArr2 = {10,20,30,40};
        int[] iArr3 = new int[] {10,20,30,40};  //위랑 동일 둘다 사용가능
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));

//        test({10,11,12,13,14});
        test(iArr2); //위와는 다르게 오른쪽은 변수 타입을 알기 때문에 사용 가능
        test(new int[] {10,11,12,13,14});

        String[] sArr = new String[5]; // [null] [null] [null] [null] [null]
        System.out.println(Arrays.toString(sArr));

        String[] sArr2 = new String[] {"apple","banana","grape","orange"};

        //  배열의 각 요소를 확인하는 세가지방법
         // 1 . 단순 for문 사용
        for(int i = 0 ; i < sArr2.length;i++ ){
            System.out.println(sArr2[i]);
        }

        // 2.Arrays.toString() 사용
        System.out.println(Arrays.toString(sArr2));

        // 3. for-each(향상된 for문)
        // jdk 1.5부터 추가
        for(String str : sArr2){
            System.out.println(str);
        }
        for(int i : iArr2){
            System.out.println(i);
        }
        // 주의 : 향상된 for문은 배열에 인덱스에 차례로 접근할때는 편하게 사용할 수 있지만 값을 변경할 수는 없다.
        for(int i : iArr2){
            i +=10;
        }
        System.out.println(Arrays.toString(iArr2));
    }

    public static void test(int[] iArr){}
}
