package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int lotto[] = new int[6];
//      방법 1.
//		for(int i = 0; i < lotto.length; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1;
//			for(int j = 0; j < i; j++) {
//				if(lotto[i] == lotto[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//      방법 2.
        label:
        for(int i = 0; i < lotto.length; i++) {

            lotto[i] = (int) (Math.random() * 45) + 1;
            for(int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    continue label;
                }
            }
        }

        int temp = 0;
        for(int i = 1; i < lotto.length; i++){
            for(int j = 0; j < lotto.length; j++){
                if(lotto[i] < lotto[j]){
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }

        for(int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
