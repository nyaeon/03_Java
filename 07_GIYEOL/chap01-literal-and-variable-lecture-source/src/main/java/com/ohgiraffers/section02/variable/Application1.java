package com.ohgiraffers.section02.variable;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        // 변수 사용 목적
        // 값에 의미를 부여
        System.out.println("통장 잔액");
        System.out.println("급여: " +(1000+200)+"원" + " \n 나는 거지야");
        int salry = 1000;
        int bonus = 20;
        System.out.println("급여: " +(salry+bonus)+"원" + " \n 나는 거지야");

        //재사용의 목적
        System.out.println("1번 고객에게 포인트 100포인트 지급함.");
        System.out.println("2번 고객에게 포인트 100포인트 지급함.");
        System.out.println("3번 고객에게 포인트 100포인트 지급함.");
        System.out.println("4번 고객에게 포인트 100포인트 지급함.");
        System.out.println("5번 고객에게 포인트 100포인트 지급함.");

        System.out.println(); //공백 한줄 추가
        int point = 200;
        System.out.println("1번 고객에게 포인트" +point+" 포인트를 지급함.");
        System.out.println("2번 고객에게 포인트" +point+" 포인트를 지급함.");
        System.out.println("3번 고객에게 포인트" +point+" 포인트를 지급함.");
        System.out.println("4번 고객에게 포인트" +point+" 포인트를 지급함.");
        System.out.println("5번 고객에게 포인트" +point+" 포인트를 지급함.");

        // 시간에 따라 변경되는 값을 저장할 수 있음
        System.out.println("변수 값 변경 테스트");
        int sum =0;
        sum = sum +10; // 현재 sum의 값은 0이고 0과 10을 더한 결과를 sum에 저장
        System.out.println("10을 더한 현재 sum의 값은 :"+sum);
        sum = sum+ 10; //sum에는 20
        sum = sum+ 10; //sum에는 30
        sum = sum+ 10; //sum에는 40
        sum = sum+ 10; //sum에는 50

        System.out.println("10을 4번 더한 현재 sum의 값은 :"+sum);







    }
}
