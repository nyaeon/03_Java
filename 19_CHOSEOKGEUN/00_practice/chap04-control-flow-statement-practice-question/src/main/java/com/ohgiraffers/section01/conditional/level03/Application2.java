/* 과일 이름("사과", "바나나", "복숭아", "키위") 중 한 가지를 문자열로 입려하면
  * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
  * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
  * -- 상품 가격 --
  * 사과 :  1000원
  * 바나나 : 3000원
  * 복숭아 : 2000원
  * 키위 : 5000원
  * -- 입력 예시 --
  * 과일 이름을 입력하세요 : 바나나
  * -- 출력 예시 --
  * 바나나의 가격은 3000원 입니다.
  * */
package com.ohgiraffers.section01.conditional.level03;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String apple = "사과";
        String banana = "바나나";
        String peach = "복숭아";
        String kiwi = "키위";

        int applePrice = 1000;
        int bananaPrice = 3000;
        int peachPrice = 2000;
        int kiwiPrice = 5000;

        while (true) {
            System.out.print("사과, 바나나, 복숭아, 키위 중 1개의 과일 이름을 띄어쓰기 없이 입력하시오: ");
            String fruit = sc.nextLine();

            if (fruit.equals(apple)) {
                System.out.println(apple + "의 가격은 " + applePrice + "원 입니다.");
                break;
            } else if (fruit.equals(banana)) {
                System.out.println(banana + "의 가격은 " + bananaPrice + "원 입니다.");
                break;
            } else if (fruit.equals(peach)) {
                System.out.println(peach + "의 가격은 " + peachPrice + "원 입니다.");
                break;
            } else if (fruit.equals(kiwi)) {
                System.out.println(kiwi + "의 가격은 " + kiwiPrice + "원 입니다.");
                break;
            } else {
                System.out.println("준비된 상품이 없습니다. 다시 입력해주시요.");
            }
        }

        sc.close();
    }
}

