package com.ohgiraffers.section04.scanner;


import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // 1. Scanner 객체 생성
        //        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // 다른 패키지의 클래스를 사용하기 위해 import
        Scanner sc = new Scanner(System.in);

        // 정수값 입력 받기
        // nextInt() : 입력받은 값을 int형으로 반환
        //        System.out.print("나이를 입력 : ");
        //        int age = sc.nextInt();
        //        System.out.println(age + "세 입니다.");

        // 실수값 입력 받기
        // nextDouble() : 입력받은 값을 double형으로 반환
        //        System.out.print("키를 입력 : ");
        //        double height = sc.nextDouble();
        //        System.out.println("height = " + height;

        // 논리형 입력 받기
        // nextBoolean() : 입력받은 값을 boolean형으로 반환 (true/false)
        //        boolean isTrue = sc.nextBoolean();
        //        System.out.print("isTrue = " + isTrue);

        // 문자열 입력 받기
        // next() : 공백 도는 개행문자 앞까지 가져옴
        //        System.out.print("이름을 입력 : ");
        //        String name = sc.next();
        //        System.out.println("name = " + name); // name = 지정호

        // 변수를 설정하지 않음, 버퍼에 남은 값을 지울때 사용
        //        sc.nextLine();

        // nextLine() : 개행문자까지 다 가져온다. (공백포함)
        //        System.out.print("주소를 입력하세요 : ");
        //        String address = sc.nextLine();
        //        System.out.println("address = " + address);

        //        System.out.print("문자열을 입력해주세요 : ");
        //        String str1 = sc.next();                //공백이나 개행문자 전 까지를 읽어온다.
        //        System.out.println("str1 : " + str1);
        //        sc.nextLine();
        //        System.out.print("숫자를 입력해주세요 : ");
        //        int num1 = sc.nextInt();                //정수 값을 읽어온다.
        //        System.out.println("num1 : " + num1);

        // 문자 입력받기
        // char는 메소드로 없고, 문자열에서 잘라와야한다.
        System.out.print("다시 시작하시겠습니까? (Y/N)");
        char ch = sc.next().charAt(0);
        System.out.println("ch = " + ch);
    }
}
