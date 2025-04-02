package com.ohgiraffers.section01.level02.normal;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        Set<Integer> set = new TreeSet<>();
        System.out.println("로또 번호를 생성합니다.");
        while(set.size()<6){
            int n = (int) (Math.random()*45+1);
            set.add(n);
        }
        System.out.print("생성된 로또 번호는: ");
        for(Integer n : set){
            System.out.print(n+ " ");
        }
        System.out.println("입니다.");
        System.out.print("보너스 번호는 ");
        int bonus=0;
        while(set.size()<7){
            bonus = (int) (Math.random()*45+1);
            set.add(bonus);
        }
        System.out.println(bonus +" 입니다.");

    }
}
