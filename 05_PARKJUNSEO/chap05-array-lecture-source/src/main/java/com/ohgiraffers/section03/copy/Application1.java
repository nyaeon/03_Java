package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application1 {

    public static void main(String[] args) {

        int[] originArr = {1, 2, 3};
        System.out.println(originArr.hashCode());
        System.out.println(Arrays.toString(originArr));
        int[] copyArr = originArr;   // 참조 주소값이 담김 -> 얕은 복사
        System.out.println("copyArr = " + copyArr.hashCode());   // originArr과 주소값이 같음 (얕은 복사)
        System.out.println(Arrays.toString(copyArr));   // 배열 값도 같음
        copyArr[0] = 1000;  // 같은 주소값이기 때문에 한놈만 바꾸면 다른놈도 바뀜
        System.out.println("===================================================");
        System.out.println("originArr = " + Arrays.toString(originArr));
        System.out.println("copyArr = " + Arrays.toString(copyArr));

        test(copyArr);

        System.out.println("===================================================");
        System.out.println("originArr = " + Arrays.toString(originArr));
        System.out.println("copyArr = " + Arrays.toString(copyArr));

        int[] ints = returnTest();

        System.out.println("===================================================");
        System.out.println(Arrays.toString(ints));
    }


    public static void test (int[] arr){
        System.out.println("arr의 hashCode() : " + arr.hashCode());
        arr[0] = 1;
    }
    
    public static int[] returnTest() {
        return new int[]{100, 200, 300};
    }
}
