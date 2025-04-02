package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        //System.out.println();
        // 1. Scanner 객체 생성
        // java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        // java.lang 패키지는 생략 가능
        //java.util.Scanner scanner2 = new java.util.Scanner(System.in);
        //다른 패키지의 클래스를 사용하기 위해서 import
        Scanner sc = new Scanner(System.in);

        // 정수값 받기
        // nextIn() : 입력받은 갑을 int형으로 반환한다.
        //int age = sc.nextInt();
        //System.out.println();
        //System.out.println("나이를 입력하세요 :");
        //System.out.println("age = " + age);

        // 실수값 받기
        // nextDouble() : 입력받은 값을 double형으로 반환
        //double height = sc.nextDouble();
        //System.out.println("height = " + height);

        // 논리형 입력받기
        // nextboolean() : 입력받은 값을 boelean형으로 반환 true/false만 받는다.
        boolean isTrue = sc.nextBoolean();
        System.out.println("isTrue = " + isTrue);

        // 문자열 입력받기
        // next() : 공백 또는 개행문자까지
        System.out.println("이름을 입력하세요 :");
        String name = sc.next();
        System.out.println("name = " + name);

        sc.nextLine();
        // nextLine() : 개행문자까지 다 가져온다. 공백포함
        System.out.println("주소를 입력하세요");
        String address = sc.nextLine();
        System.out.println("address = " + address);


        // Scanner sc = new Scanner(System.in);

        /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때  */
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();				//공백이나 개행문자 전 까지를 읽어온다.
        System.out.println("str1 : " + str1);

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();				//정수 값을 읽어온다.
        System.out.println("num1 : " + num1);


        // 문자 입력받기
        System.out.print("다시 시작하시겠습니까? (y/n) : ");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);

    }

}
