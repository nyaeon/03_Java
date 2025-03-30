package com.ohgiraffers.section04.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // 1. Scanner 객체 생성
        //java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);

        // 하지만 java.lang은 패키지이름 생략 가능하다
        //java.util.Scanner scanner = new java.util.Scanner(System.in);

        // 다른 패키지의 클래스 사용 위해 import
        Scanner sc = new Scanner(System.in);

        // 2. 자료형별 값 입력받기
        // 정수 입력
//        System.out.print("나이를 입력하세요 : ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);

        // 실수 입력
//        System.out.print("키를 입력하세요 : ");
//        double number = sc.nextDouble();
//        System.out.println("키 =  " + number);

        // 논리형 입력
        // nextBoolean() true/false만 받음
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue = " + isTrue);
//
        // 문자형 입력
        // next() : 공백 또는 개행문자까지
//        System.out.print("이름을 입력하세요 : ");
//        String name = sc.next();
//        System.out.println("name = " + name);

//        sc.nextLine();
        // next()는 문자열은 글자를 하나씩 토큰화해서 가져오기 때문에 공백이 포함되면 오류가 난다.

        // nextLine() : 개행문자까지 다 가져옴. 공백 포함
//        System.out.print("주소를 입력하세요 : ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);

        // 문자 입력
        System.out.print("다시 시작하시겠습니까? : ");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);
    }

}
