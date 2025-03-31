package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        System.out.println("=======오늘의 로또번호========");
        int[] loto = new int[7];
        for (int i = 0; i < loto.length; i++) {
            loto[i] = (int)(Math.random() * 45 + 1);
//            if (loto[i] == loto[i + 1]) {
//                continue;
//            }
            System.out.print(loto[i]+ " ");
        }
    }
}
