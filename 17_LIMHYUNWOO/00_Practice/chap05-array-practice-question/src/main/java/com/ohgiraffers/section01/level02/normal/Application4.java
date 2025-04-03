package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Random;

public class Application4 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] rotto= new int[6];
        for(int i=0;i<6;i++){
            rotto[i]=random.nextInt(45);
        }
        System.out.println(Arrays.toString(rotto));
     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.


		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
    }
}
