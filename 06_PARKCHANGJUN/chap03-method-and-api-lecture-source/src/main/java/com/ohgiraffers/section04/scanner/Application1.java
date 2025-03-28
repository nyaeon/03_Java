package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        // 1. Scanner 객체생성
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        java.lang패키지는 생략가능
//        java.util.Scanner scanner = new java.util.Scanner(System.in);
//        다른 패키지의 클래스를 사용하기 위해서 import
        /* 스캐너 객체 생성 */
        Scanner sc = new Scanner(System.in);

        // 정수값 받기
        //  nextInt() : 입력받은 값을 int형으로 반환된다.
//        System.out.print("나이를 입력하세요: ");
//        int age = sc.nextInt();
//        System.out.println("age = " + age);

        //  실수값 받기
        // nextDouble() : 입력받은 값을 double형으로 반환한다.
//        System.out.println("키를 입력하세요 : ");
//        double height = sc.nextDouble();
//        System.out.println("height = " + height);
        
        // 논리형 입력받기
        // nextBoolean() : 입력받은 값을 boolean형으로 반환 true / false만 받는다.
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue = " + isTrue);
        
        // 문자열 입력받기
        // next() : 공백 또는 개행문자까지
//        System.out.print("이름을 입력하세요 : " );
//        String name = sc.next();
//        System.out.println("name = " + name);
//
//        sc.nextLine();
//        // nextLine() : 개행문자까지 다 가져온다. 공백포함
//        System.out.print("주소를 입력하세요 : ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);

        //

            /* 스캐너 주의 사항 */

            /* 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
             * 그래서 크게 두 가지 사항을 주의해야 한다.
             * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
             * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
             * */


            /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때  */
//            System.out.print("문자열을 입력해주세요 : ");
//            String str1 = sc.next();				//공백이나 개행문자 전 까지를 읽어온다.
//            System.out.println("str1 : " + str1);
//
//            sc.nextLine();
//            System.out.print("숫자를 입력해주세요 : ");
//            int num1 = sc.nextInt();				//정수 값을 읽어온다.
//            System.out.println("num1 : " + 
        
            // 문자 입력받기
            // 문자열은 입력을 받게 되면 . ex) HELLO 에서 인덱스로 하면 H는 0번재이다.
        System.out.print("다시 시작하시겠습니까? (y/n): ");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);;
        
    }
}

