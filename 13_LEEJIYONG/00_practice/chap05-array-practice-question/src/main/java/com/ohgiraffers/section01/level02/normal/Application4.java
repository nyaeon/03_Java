package com.ohgiraffers.section01.level02.normal;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        Set<Integer> set=  new HashSet<>();
        Random random = new Random();
        while(set.size()< 6){
            set.add(random.nextInt(45)+1);
        }

        for (int i : set){
            System.out.print(i + " ");
        }
    }
}
