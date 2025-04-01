package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        // 1 ~ 45
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int randomN = (int) (Math.random() * 45 + 1);
            while (Arrays.asList(arr).contains(randomN)) {
                randomN = (int) (Math.random() * 45 + 1);
            }
            arr[i] = randomN;
        }
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}

