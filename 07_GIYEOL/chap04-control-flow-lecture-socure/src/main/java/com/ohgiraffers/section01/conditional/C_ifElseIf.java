package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseIf {
    public void testelseif() {
        String texts = """
                산 속에서 나무를 하던 나무꾼이 연못에 도끼를 빠뜨리고 말았다. 그때!!
                연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.
                나무꾼에게 셋 중 어떤 도끼가 나무꾼의 도끼인지 물어보았다.
                
                어느 도끼가 너의 도끼인가??????????????????? (1.금도끼, 2.은도끼, 3.쇠도끼):
                """;
        System.out.println(texts);
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("사라짐");
        } else if (answer == 2) {
            System.out.println("정말로 ");
        } else {
            System.out.println("그게 너야");
        }
        System.out.print("산신령 사라짐");
/***
 * ohgiraffers 대학의 김XX 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는
 *  채점방식을 사용하고 있다.
 *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 마지막으로
 *  60점 미만인 경우에는 'F'를 학점으로 주게 된다.
 *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
 *  (추가로, 각 등급의 중간점수(95, 85, 75...) 이상인 경우 '+'를 붙여서 등급을 세분화 해보자.)
 * 설명.
 *  출력 예시: XXX 학생의 점수는 86점이고, 등급은 B+입니다.
 *            프로그램을 종료합니다.
 */


        System.out.print("학생 이름");
        String name = sc.nextLine();
        System.out.print(name + "학생의 성적:");
        int point = sc.nextInt();

        String grade = "";
        if (point >= 90) {
            grade = "A";
            if (point >= 95) {
                grade += "+";
            }
        } else if (point >= 80) {
            grade = "B";
            if (point >= 85) {
                grade += "+";
            }
        } else if (point >= 70) {
            grade = "C";
            if (point >= 75) {
                grade += "+";
            } else if (point >= 60) {
                grade = "D";
                if (point >= 65) {
                    grade += "+";
                }
            } else {
                grade = "F";
            }
            System.out.print(name + "학생의 " + point + "점수는" + grade + "등급이다");
            System.out.print("종료");
        }
        /***
         *  if(point >= 90) {
         *             grade = "A";
         *         } else if(point >= 80) {
         *             grade = "B";
         *         } else if(point >= 70) {
         *             grade = "C";
         *         } else if(point >= 60) {
         *             grade = "D";
         *         } else {
         *             grade = "F";
         *         }
         *
         *         if(point == 100 || (point % 10 >= 5 && point >= 60)) {
         *             grade += "+";
         *         }
         */

    }

    }
    
