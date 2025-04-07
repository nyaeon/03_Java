package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */
        while(true) {
            System.out.println("\nEnter your serial number: ");
            System.out.println("(Enter \"q\" or \"Q\" to quit)");
            Scanner serialNum = new Scanner(System.in);
            String yourSerialNumber = serialNum.nextLine();

//        if (yourSerialNumber.length() == 14 && yourSerialNumber.charAt(6) == '-') {
//
//            String VisableSide = yourSerialNumber.substring(0, 8);
//
//            String hideNum = VisableSide + "******";
//
//            System.out.println("Here's your serial number: " + hideNum);
//        } else {
//            System.out.println("Wrong serial number, try 123456-1234567 format: ");
//
//        }

            String makeString = yourSerialNumber.replace("-", "");

            if (makeString.length() == 13) {

                StringBuilder serialFormat = new StringBuilder(makeString);
                serialFormat.insert(6, "-");

                char[] serialArr = serialFormat.toString().toCharArray();

                for (int i = 8; i < 14; i++) {
                    serialArr[i] = '*';
                }

                System.out.println("---------------------------------------");
                System.out.println("Your serial number is: " + new String(serialArr));
                System.out.println("---------------------------------------");
            } else {
                System.out.println("Your serial number is incorrect");
            }

            if (yourSerialNumber.equals("q") || yourSerialNumber.equals("Q")) {
                break;
            }


        }

    }
}
