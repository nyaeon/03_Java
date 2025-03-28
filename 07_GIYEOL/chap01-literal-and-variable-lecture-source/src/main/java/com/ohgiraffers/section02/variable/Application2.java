package com.ohgiraffers.section02.variable;

import javax.print.DocFlavor;

public class Application2 {
    public static void main(String[] args) {
        // 정수를 취급하는 자료형

        // 변수를 선언
        byte bNum;      //1바이트
        short sNum;     //2바이트
        int iNum;       //4바이트 (기본값)
        long lNum;      //8바이트

        // 실수를 취급하는 자료형
        Float fNum;     //4바이트
        Double dNum;    //8바이트

        //문자를 취급하는 자료형
        //CHAR CH; // 2바이트

        //논리값을 취급하는 자료형
        Boolean istrue; //1바이트

        //문자열을 취급하는 자료형
        String str;     //4바이트

        //자료형 별로 초기화
        bNum = 1;
        sNum = 2;
        iNum = 4;
        lNum = 220000000000L; //long에 대입되는 값은 L을 붙인다

    
        fNum = 3.14f; // duoble형으로 인식되는 실수를 float에 담을 때는 f를 붙임
        dNum = -3.14;
    
        //ch ='a';
        //ch = 97; //char는 양수만 가능

        istrue = true;


        int kor = 90;
        int math = 80;
        int eng = 75;
        int sum = kor + math + eng;
        System.out.println("sum = "+sum);

        System.out.println(sum /3);
        double  avg = sum / 3.0; //나눗셈은 일반적으러 실수가 나오면 나눌 때 둘 중 하나 이상은 실수값이여야 한다
        System.out.println("avg = "+avg);


        




    }
}
