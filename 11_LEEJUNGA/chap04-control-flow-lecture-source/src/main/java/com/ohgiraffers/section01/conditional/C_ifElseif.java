package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void testSimpleIfElseifStatement() {
        Scanner sc = new Scanner(System.in);

        String texts = """
                도끼골라 
                
                (1.금도끼, 2.은도끼, 3.쇠도끼) :
                """;

        System.out.println(texts);
        int answer = sc.nextInt();
        if (answer == 1) {
            System.out.println("못줘");
        } else if (answer == 2) {
            System.out.println("거짓말");
        } else {
            System.out.println("다드림");
        }

        System.out.println("--------------");
    }

    public void testNestedIfElseifStatement() {
        /*
            * ohgiraffers 대학의 김XX 교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있다.
             90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D', 마지막으로
             60점 미만인 경우에는 'F'를 학점으로 주게 된다.
             그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
             (추가로, 각 등급의 중간점수(95, 85, 75...) 이상인 경우 '+'를 붙여서 등급을 세분화 해보자.)
             설명.
             출력 예시: XXX 학생의 점수는 86점이고, 등급은 B+입니다.
             프로그램을 종료합니다.
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();
        System.out.print("학생 성적 : ");
        int point = sc.nextInt();

        String grade;
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
            }
        } else if (point >= 60) {
            grade = "D";
            if (point >= 65) {
                grade += "+";
            }
        } else {
            grade = "F";
        }

        System.out.println(name + "학생의 점수는 " + point + "점이고, 등급은 " + grade + "입니다.");
    }
}
