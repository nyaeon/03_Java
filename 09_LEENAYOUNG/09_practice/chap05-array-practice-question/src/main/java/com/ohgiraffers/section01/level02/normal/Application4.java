package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        // 로또 번호 범위: 1~45
        // 선택 개수: 6개의 서로 다른 숫자

        int[] lotto = new int[6];

        for (int i = 0; i < 6; i++) {
            int rand;
            boolean isDuplicate;

            // 중복 값 없이 배열에 6개 숫자 저장
            do {
                rand = (int) (Math.random() * 45) + 1;
                isDuplicate = false;

                for (int j = 0; j < i; j++) {
                    if (rand == lotto[j]){
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);

            lotto[i] = rand;
        }

        // 배열 오름차순으로 정렬
        Arrays.sort(lotto);

        System.out.println(Arrays.toString(lotto));
    }
}
