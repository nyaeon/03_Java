package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {
        /***
         * 깊은 복사를 하는 방법은 4가지가 있다
         * 1.for문을 이용한 동일한 인덱스 값을 일일이 복사
         * 2.object의 clone()을 이용한 복사(많이 사용)
         * 3.System의 arraycopy()를 이용한 복사
         * 4.Arrays의 copyof()를 이용한 복사
         */
        /***
         * 전달 받은 배열의 정보 출력용 메소드
         * @param arr 출력할 배열의 주소값
         * @param desc 출력할 명
         */
    int[] orignArr = new int[]{1,2,3,4};
    print(orignArr, "원본");

        //1.for 문 활용
        int[] copyArr1 = new int[orignArr.length];
        for(int i =0;i<orignArr.length;i++) {
            copyArr1[i] = orignArr[i];
        }
        print(copyArr1, "for문을 활용한 사본");
        copyArr1[0]=100;
        print(orignArr,"확인용");
        print(copyArr1,"확인용");

        //2.clone() 활용
        int[] copyArr2 = orignArr.clone();
        print(copyArr2,"clone()을 활용한 사본");


        //3.arraycopy() 를 이용한 복서
        int[] copyArr3 = new int[orignArr.length+3]; //원본보다 3크기가 더 큰 배열을 할당
        //             (원본배열 , 복사를 시작할 인덱스, 복사본 배열 생성, 복사를 시작할 인덱스, 복사할 길이)
        System.arraycopy(orignArr,0,copyArr3,1,orignArr.length);
        print(copyArr3,"arraycopy를 활용한 사본");


        //4.copyof() 를 이용한 복사 (원본의 처음부터만 가능)
        int[] copyArr4 = Arrays.copyOf(orignArr,2);
        print(copyArr4,"copyof()를 이용한 사본");
        
    }
    public static void print(int[] arr,String desc){
        System.out.printf("===================== %s ======================\n",desc);
        System.out.println("넘어온 배열의 hashcode 값 :" + arr.hashCode());
        System.out.println(Arrays.toString(arr));
    }
}
