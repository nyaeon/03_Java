package com.ohgiraffers.section01.conditional.level01.basic;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /*
        * 나이를 입력 받아 입력받은 수가 13세 이하이면 "어린이"출력, 13세 초과 ~ 19세 이하이면 "청소년" 출력, 19세 초과 "성인"을 출력하세요.
        * 
        * 나이를 입력하세요 : 12
        * 
        * ---- 출력 ----
        * 어린이
        * 
        * 나이를 입력하세요 : 29
        * 성인
        * */
        
        while (true) {

            System.out.println("\nPlease enter your age: \nEnter \"q\" to quit");
            Scanner sc = new Scanner(System.in);
            String age = sc.nextLine();
            
            if (age.equals("q")) {
                System.out.println("Goodbye!");
                break;
            }
            
            if (!age.matches("[0-9]+")) {
                System.out.println("Please enter a valid age!");
                continue;
            }

            int intage = Integer.parseInt(age);
            
            
            if (intage <= 13) {
                System.out.println("\n------------------------------------------");
                System.out.println("Your age is " + intage + " years old"
                + "\nYou are child.");
                System.out.println("------------------------------------------\n");
            } else if (intage > 13 && intage <= 19) {
                System.out.println("\n------------------------------------------");
                System.out.println("Your age is " + intage + " years old"
                + "\nYou are grandchild.");
                System.out.println("------------------------------------------\n");
            } else if (intage > 19) {
                System.out.println("\n------------------------------------------");
                System.out.println("Your age is " + intage + " years old"
                + "\nYou are adult.");
                System.out.println("------------------------------------------\n");
            }
            
            sc.close();
            
        }

        
    }
}
