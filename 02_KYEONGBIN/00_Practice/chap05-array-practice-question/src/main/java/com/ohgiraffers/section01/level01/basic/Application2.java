package com.ohgiraffers.section01.level01.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 길이가 5인 String 배열을 선언하고
         * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
         * 스캐너로 0부터 4까지의 정수를 입력 받아
         * 해당 정수의 인덱스에 있는 과일을 출력하세요
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */

        String[] bamm = new String[5];
        bamm[0] = "딸기";
        bamm[1] = "바나나";
        bamm[2] = "복숭아";
        bamm[3] = "키위";
        bamm[4] = "사과";
        
        System.out.println("We have " + Arrays.toString(bamm));
        System.out.println();

        while (true) {
            System.out.println();
            System.out.println("Please enter the number from 0 to 4");
            System.out.println("Please enter the \"e \" key if you wish to leave : ");

            Scanner bammm = new Scanner(System.in);
            
            int num = bammm.nextInt();
            String End = bammm.nextLine();
            if (num >= 0 && num <= 4) {
                if (num == 0) {
                    System.out.println();
                    System.out.println("Here's ur " + bamm[0]);                    
                } else if (num == 1) {
                    System.out.println();
                    System.out.println("Here's ur " + bamm[1]);
                } else if (num == 2) {
                    System.out.println();
                    System.out.println("Here's ur " + bamm[2]);
                } else if (num == 3) {
                    System.out.println();
                    System.out.println("Here's ur " + bamm[3]);
                } else if (num == 4) {
                    System.out.println();
                    System.out.println("Here's ur " + bamm[4]);
                } else if (End.equals("e")) {
                    System.out.println("The service is closing");
                    break;
                } else {
                    System.out.println("It's not a correct key, please enter again.");
                }
            } else {
                System.out.println();
                System.out.println("준비된 과일이 없습니다.");
            } 

            }
            
        }





         
    }

