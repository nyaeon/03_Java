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

        /*
        charAt() 함수는 문자열에서 특정 인덱스에 위치하는 유니코드 단일문자를 반환.
        1,3 - 남자, 2,4 - 여자
        nextLine() : String으로 읽어온다.(띄어쓰기 포함 한 줄을 읽는다. Enter 이전까지)
         */
        Scanner in = new Scanner(System.in);

        System.out.println("주민등록번호를 입력해주세요(- 포함, 예시 881122-1) : ");
        int num = in.nextLine().charAt(7);

        if (num == '1' || num == '3') {
            System.out.println("남자 입니다");
        } else if (num == '2' || num == '4') {
            System.out.println("여자 입니다");
        }

    }
}
