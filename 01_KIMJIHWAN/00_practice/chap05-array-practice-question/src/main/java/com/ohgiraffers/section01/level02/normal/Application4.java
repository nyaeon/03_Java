package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */


        for (int i = 0; i < 5; i++) {
            int[] lotto = new int[6];
            for (int j = 0; j < 6; j++) {
                int num = (int) (Math.random() * 45 + 1);
                boolean dup = false;

                for (int k = 0; k < 6; k++) {   // 중복검사
                    if (lotto[k] == num) {
                        break;
                    } else {
                        dup = true;
                    }
                }

                if (dup) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}
