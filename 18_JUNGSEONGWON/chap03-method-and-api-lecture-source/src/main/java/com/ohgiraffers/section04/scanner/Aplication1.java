package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Aplication1 {

    public static void main(String[] args) {
        System.out.println("Hello World"); // 결과를 도출해서 내 보낸다. out -> err로 바꾸면 빨간글씨로 보여준다
        // 1. Scanner 객체 생성
        // java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        // java.lang 패키지는 생략 가능
        // 다른 패키지의 클래스를 사용하기 위해서 import
        Scanner sc = new java.util.Scanner(System.in);

        // 정수 값 받기
        // nextInt() : 입력 받은 값을 int형으로 반환한다.
        /*  System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt(); // 정수 값을 받을 수 있는 텍스트 창을 부여 해주는 것
        System.out.println("age = " + age);
        
        // 실수 값 받기
        // nextDouble() : 입력 받은 값을 double 형으로 반환한다.
        System.out.print("키를 입력하세요 : ");
        double height = sc.nextDouble();
        System.out.println("height = " + height);
        */
        
        // 논리형 입력받기
        // nextBoolean() : 입력받은 값을 boolean형으로 반환 true/false만 받는다.
        /*boolean isTrue = sc.nextBoolean();
        System.out.println("isTrue = " + isTrue);
        
         */
        
        //문자열 입력 받기
        // next() : 공백
        /*
        System.out.print("이름을 입력하세요 : ");
        String name = sc.next(); // 공백까지만 끊어서 가져온다. 정 승원을 입력하면 정 만 가지고 온다.
        System.out.println("name = " + name); // 홍만 출력 길동은 버퍼에 저장.
        sc.nextLine(); // 변수가 선언되어 있지 않아 받을 수 밖에 없는 데 그 상태에서 next()가 진행 된 뒤 남은 데이터 값들을 가지고 간다.
        // 그래서 밑의 nextline()은 정상 작동을 하게 된다.
        // nextline() : 개행문자까지 다 가져온다. 공백포함
        System.out.print("주소를 입력하세요 : ");
        String address = sc.nextLine();
        System.out.println("address = " + address);

         */

        // 문자 입력받기
        System.out.println("다시 시작하시겠습니까? (y/n) : ");
        char ch = sc.next().charAt(0); // charAt은 문자열의 몇번 번호를 골라서 가지고 오는 것 이다.
        //charAt(0) 이니 문자열의 0번을 가지고 오는 것이다. 
        System.out.println("ch = " + ch);


        
        
        
    }
}
