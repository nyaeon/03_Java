package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("주민번호를 입력하세요 : ");
        char cNum = sc.next().charAt(7);
        if (cNum == '1'||cNum == '3'){
            System.out.println("남자입니다.");
        }else {
            System.out.println("여자입니다.");
        }
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
    }
}
