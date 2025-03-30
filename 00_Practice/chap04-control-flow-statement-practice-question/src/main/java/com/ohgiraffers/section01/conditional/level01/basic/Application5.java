package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
        * 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
        * 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
        *
        * 인원 수 : 29
        * 사탕 개수 : 100
        *
        * 1인당 사탕 개수 : 3
        * 남는 사탕 개수 : 13
        * */
        Scanner in = new Scanner(System.in);
        System.out.println("사탕 다 같이 나눠먹자");
        System.out.println("인원 수 : ");
        int people = in.nextInt();

        System.out.println("사탕 개수 : ");
        int num = in.nextInt();

        int result = num / people;
        int remainder = num - (result * people);

        System.out.println("1인당 사탕 개수 : " + result);
        System.out.println("남는 사탕 개수 : " + remainder);
    }
}
