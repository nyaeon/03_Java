package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 깊은 복사를 하는 방법은 4가지가 있다.
        * 1. for문을 이용한 동일한 인덱스 값을 일일이 복사
        * 2. object의 clone()을 이요한 복사(사용 빈도 높음)
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Arrays의 copyOf()를 이용한 복사
        * */

        int[] originArr = new int[]{1, 2, 3, 4};
        print(originArr, "원본");

        // 1. for문 활용
        int[] copyArr1 = new int[originArr.length];
        for (int i = 0; i < originArr.length; i++) {
            copyArr1[i] = originArr[i];
        }

        print(copyArr1, "for문을 활용한 사본");
        copyArr1[0] = 100;

        print(originArr, "확인용");
        print(copyArr1, "확인용");

        // 2. clone() 활용
        int[] copyArr2 = originArr.clone();
        print(copyArr2, "clone()을 활용한 사본");

        // 3. arraycopㅛ()를 이용한 복사
        int[] copyArr3 = new int[originArr.length + 3]; // 원본보다 3크기가 더 큰 배열 할당
        //               원본배열, 복사를 시작할 인덱스, 복사본 배열, 복사를 시작할 인덱스, 복사할 길이
        System.arraycopy(originArr, 0, copyArr3, 2, originArr.length);
        print(copyArr3, "arraycopy()를 활용한 사본");

        // 4. copyOf()를 이용한 복사(원본의 처음부터만 가능)
        int[] copyArr4 = Arrays.copyOf(originArr, 3);
        print(copyArr4, "copyOf()를 활용한 사본");
    }

    /***
     * 전달받은 배열의 정보출력용 메소드
     * @param arr 출력할 베열의 주소값
     * @param desc 출력명
     */
    public static void print(int[] arr, String desc) {
        System.out.printf("======%s======\n", desc);
        System.out.println("넘어온 배열의 hashCode 값: " + arr.hashCode());
        System.out.println(Arrays.toString(arr));
    }
}
