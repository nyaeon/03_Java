package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Random;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] lotto = new int[6];
        Random random = new Random();

        for (int i = 0; i < lotto.length;) {
            int num = random.nextInt(45) + 1;
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (lotto[j] == num)  {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                lotto[i] = num;
                i++;
            }
        }

        Arrays.sort(lotto);

        for (int num : lotto) {
            System.out.print(num + " ");
        }
    }
}
