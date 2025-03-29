package com.ohgiraffers.section04.scanner;
import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        //1. 스캐너 객체 생성
        // java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        //java.lang 패키지는 생략 가능
        //java.util.Scanner scanner = new java.util.Scanner(System.in);
        //다른 패키지의 클래스를 사용하기위해 import 사용
        Scanner sc = new Scanner(System.in);
        //정수값 받기 
        //nextInt(): 입력받은 값을 int형으로 반환
        /*
        System.out.print("몇 살이세요?");
        int age = sc.nextInt();
        System.out.println("age = " + age);
        */

        /*
        //실수
        //next double() : 입력값을 double형으로 반환
        System.out.print("키는 ?");
        double height = sc.nextDouble();
        System.out.println("height = " + height);
        */


        /*
        //논리형
        //nextBoolean(): 입력값을 boolean으로 설정하면 true/false만 받음
        boolean istrue = sc.nextBoolean();
        System.out.println("istrue = " + istrue);
        */

        /*
        //문자열
        // next(): 공백 또는 개행문자까지 가짐
        System.out.print("이름을 입력");
        String name = sc.next();
        System.out.println("name = " + name);
        sc.nextLine();

        //nextLin() : 개행문자까지 다 가져온다 . 공백 포함
        System.out.print("주소 입력:");
        String address = sc.nextLine();
        System.out.println("address = " + address);
        */

        //문자 받기
        System.out.print("다시 시작하겠다 (y/n)");
        char ch =sc.next().charAt(0);
        sc.nextLine();
        System.out.println("ch =" + ch);























        /* 스캐너 주의 사항

        /* 스캐너의 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다.
         * 그래서 크게 두 가지 사항을 주의해야 한다.
         * 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때
         * 2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때
         * */

        /* 스캐너 객체 생성 */
        /* 1. next()로 문자열 입력 받은 후 정수, 실수, 논리값 입력 받을 때  */
        /*
        System.out.print("문자열을 입력해주세요 : ");
        String str1 = sc.next();				//공백이나 개행문자 전 까지를 읽어온다.
        System.out.println("str1 : " + str1);
        sc.nextLine();

        System.out.print("숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();				//정수 값을 읽어온다.
        System.out.println("num1 : " + num1);
        */







    }
    }





