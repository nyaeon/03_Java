package com.ohgiraffers.section01.level02.normal;


import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int[] lotto = new int[6];
        System.out.println("=======오늘의 로또번호========");
        for (int i = 0; i < lotto.length; i++) {
        int num = (int) (Math.random() * 45) + 1;
        lotto[i] = num;
        for (int j = 0; j < i; j++) {
            if (num == lotto[j]) {
                i--;
                break;
            }
        }
            System.out.print(lotto[i] + " ");
        }
    }
}
