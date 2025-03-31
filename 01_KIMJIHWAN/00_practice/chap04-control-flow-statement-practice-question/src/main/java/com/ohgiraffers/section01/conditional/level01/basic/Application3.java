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
        // (Q&A) explain : 음... swith문과 charAt을 사용하는 것은 맞는 거 같은데 null 값이나 false값 처리하는 방법을 모르겠다.
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력해주세요(- 포함) : ");
        char a = sc.next().charAt(7);
        System.out.println((a == '1' || a == '3') ? "남자입니다." : (a == '2' || a == '4') ? "여자입니다.":"똑바로 입력해주세요");
    }
}
