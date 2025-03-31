package com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application_01 {
    public static void main(String[] args) {

        // 원본 배열 선언 및 초기화
        int[] originArr = {1, 2, 3};
        System.out.println("originArr hashCode : " + originArr.hashCode()); // 배열의 해시코드 (주소값)
        System.out.println("originArr : " + Arrays.toString(originArr)); // 배열 값 출력

        // 얕은 복사 (참조 복사)
        int[] copyArr = originArr;
        System.out.println("copyArr hashCode : " + copyArr.hashCode()); // 같은 주소값을 가짐
        System.out.println("copyArr : " + Arrays.toString(copyArr));

        // 복사한 배열의 값 변경
        copyArr[0] = 1000;
        System.out.println("---------------------------------");
        System.out.println("originArr : " + Arrays.toString(originArr)); // 원본 배열도 변경됨
        System.out.println("copyArr : " + Arrays.toString(copyArr));

        // 메서드 호출 후 배열 값 변화 확인
        test(copyArr);
        System.out.println("---------------------------------");
        System.out.println("originArr : " + Arrays.toString(originArr)); // 원본 배열 영향 받음
        System.out.println("copyArr : " + Arrays.toString(copyArr));

        // returnTest() 메서드의 실행 결과를 저장
        int[] testArr = returnTest();
        System.out.println("returnTest() 결과 : " + Arrays.toString(testArr));
    }

    // 배열을 매개변수로 받아 값을 변경하는 메서드
    public static void test(int[] arr) {
        System.out.println("arr의 hashCode() : " + arr.hashCode()); // 같은 주소값을 공유함
        arr[0] = 1; // 배열의 첫 번째 요소를 1로 변경 (원본 배열도 영향을 받음)
    }

    // 새로운 배열을 생성하여 반환하는 메서드
    public static int[] returnTest() {
        return new int[] { 100, 200, 300 }; // 새로운 배열 생성 후 반환
    }
}
