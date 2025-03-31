 /*
  * 임의의 정수를 하나 선언하고 선언한 숫자가 짝수이면 "짝수다", 짝수가 아니면
  * "홀수다"를 출력하세요
  *
  * ------- 출력 결과 화면 ----------
  *
  * 예)정수 9를 선언했을 경우
  *
  * 홀수
  * */

 package com.ohgiraffers.operatorPractice;

 import java.util.Scanner;

 public class Application1 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int number;

         //  반복
         while (true) {
             System.out.print("0 이외의 정수를 입력 하시오: ");
             number = sc.nextInt();

             if (number == 0) {
                 System.out.println("0 이외의 정수를 다시 입력 하시오.");
             } else {
                 break;
             }
         }
         if (number % 2 == 0) {
             System.out.println("짝수");
         } else {
             System.out.println("홀수");
         }

         sc.close();
     }
 }

