package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
        *
        * 힌트 : charAt()
        * 예시)
        * 주민등록번호를 입력해주세요(- 포함) : 881122-1
        *
        * ---출력----
        * 남자 입니다
        * */

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력해주세요(- 포함) : ");
        char a = sc.next().charAt(7) ;
        if(a == '1' || a == '3') {
            System.out.println("남자 입니다.");
        } else if (a == '2' || a == '4') {
            System.out.println("여자 입니다.");
        } else {
            System.out.println("올바르게 입력해주세요.");
        }
    }

}
