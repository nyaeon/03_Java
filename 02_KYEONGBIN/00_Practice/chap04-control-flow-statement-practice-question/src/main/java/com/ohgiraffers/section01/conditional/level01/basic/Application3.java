package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
        * 주민등록번호를 입력받아서 남자이면 "남자 입니다.", 여자이면 "여자 입니다"를 출력하세요
        *
        * 힌트 : charAt()
        * 예시)
        * 주민등록번호를 입력해주세요(- 포함) : 881122-1
        *
        * ---출력----
        * 남자 입니다
        * */


        while (true) {

            System.out.println("\nEnter your ID number: \nEnter \"q\" to quit");
            Scanner sc = new Scanner(System.in);
            String x = sc.nextLine();

            if (x.equals("q")) {
                System.out.println("Service is closing");
                break;
            }
            if (!x.matches("[0-9\\-]+")) {
                System.out.println("Please enter a valid number!!");
                continue;
            }

            String hp = x.replace("-", "");

            if (hp.length() == 13) {

                char gender = hp.charAt(6);

                if (gender == '1' || gender == '3') {
                    System.out.println("\n--------------------");
                    System.out.println("It's male");
                } else if (gender == '2' || gender == '4') {
                    System.out.println("\n--------------------");
                    System.out.println("It's female");
                } else {
                    System.out.println("Please enter a valid ID number!!");
                    continue;
                }

                StringBuilder addHp = new StringBuilder(hp);
                addHp.insert(6, "-");

                char[] numArr = addHp.toString().toCharArray();
                for (int i = 8; i < 14; i++) {
                    numArr[i] = '*';
                }

                System.out.println("Your ID number is : " + new String(numArr));
                    System.out.println("--------------------\n");




            } else {
                System.out.println("Please enter a valid ID number!!");
            }
        }

    }
}
