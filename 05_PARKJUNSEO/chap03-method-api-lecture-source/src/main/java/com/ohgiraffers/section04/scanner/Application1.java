package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        
        // 1. Scanner 객체생성
        // java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        // java lang 패키지는 생략 가능, 즉 이게 가능함
        // java.util.Scanner scanner = new java.util.Scanner(System.in);
        // 다른 패키지의 클래스를 사용하기 위해서 import 해야 함
        Scanner sc = new Scanner(System.in);

        // 정수값 받기
        // nextInt() : 입력받은 값을 int형으로 반환
//        System.out.print("나이를 입력하세요: ");
//        int age = sc.nextInt();
//        System.out.println("age: " + age);

        // 실수값 받기
        // nextDouble() : 입력받은 값을 double형으로 반환한다.
//        System.out.print("키를 입력하세요: ");
//        double height = sc.nextDouble();
//        System.out.println("height: " + height);

        // 논리형 받기
        // nextBoolean(): 입력받은 값을 boolean형으로 반환 true/false만 받는다.
//        boolean isTrue = sc.nextBoolean();
//        System.out.println("isTrue: " + isTrue);

        // 문자열 받기
        // next(): 공백 또는 개행문자까지만 끊고 가져옴 ('박 준서'라고 치면 박만 가져옴)
//        System.out.print("이름을 입력하세요: ");
//        String name = sc.next();
//        System.out.println("name: " + name);


        // sc.nextLine();
        // nextLine(): 공백과 개행문자까지 다 가져옴
//        System.out.print("주소를 입력하세요: ");
//        String address = sc.nextLine();
//        System.out.println("address = " + address);
        /*
        버퍼 때문에 next()에 홍 길동이라고 입력하면
        재밌어짐,,,위는 다 주석하고 / 성 이름을 만드는 데 사용할 수 있을 듯
        -> 즉 메서드들의 특징 때문인 걸로,,,next()와 nextLine()을 연달아 작성하면 이렇게 됨
         */

        /* 이런 건 이렇게 해결이 가능함*/ // next()뒤에 바로 sc.nextLine() 입력


        // 문자 입력받기
        System.out.print("다시 시작하시겠습니까? (y/n): ");
        char ch = sc.next().charAt(0);    // nextChar()라는 메서드는 없음; charAt(n)은 그 문자의 인덱스를 이용함
        System.out.println("ch = " + ch);
    }

}


